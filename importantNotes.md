For default Order of obects on sort override compareTo from interface Comparable.



Comparator can be created by implementing Comparator Interface. This Comparator is passed to the list.sort() to sort the objects.





### ///////////////////////////////DATABASE////////////////////////////



#### **METHOD 1 (Using JDBC directly and raw SQL query)(PreparedStatement, Statement (createStatement) and ResultSet)**

Class.forName("com.mysql.cj.jdbc.Driver"); // To check if JDBC driver is present or not



**Statement:** To execute a query like select.

**preparedStatement:** To execute a query which changes the data like add, update and delete. It can also be used for select if there are certain variables in it**.**

**ResultSet:** To get output of **Statement** execution.

**CallableStatement:** To call a procedure or callable statement



*To connect with Database*

Connection con = DriverManager.getConnection(url,uname,password);



***To get the data from database (READ)***

Statement st = con.createStatement();

ResultSet rs = st.executeQuery(query***:String***);

*Now loop till rs.next() and get data using rs.getInt(**columnName** or <b>columnNumber</b>)*

***Example:***

&#x09;*Statement st = con.createStatement();*

&#x20;       *String query = "Select \* from student";*

&#x20;       *ResultSet rs = st.executeQuery(query);*

&#x20;       *while(rs.next()) {*

&#x20;       	*System.out.println("Student ID: "+rs.getInt("stdId"));*

&#x20;       	*System.out.println("Student Name: "+rs.getString("studentName"));*

&#x20;       	*System.out.println("Student Marks: "+rs.getDouble(3));*

&#x20;       	*System.out.println("Student Mobile Number: "+rs.getString(4));*

&#x20;       	*System.out.println("Student DOB: "+rs.getString("DOB"));*

&#x20;       *}*



***To get insert, update and delete data from database (CREATE || UPDATE || DELETE)***

PreparedStatement ps = con.prepareStatement(query);

ps.setInt(index,value), ps.setString(index,value), ps.setDouble(index,value) and many more...........

ps.executeUpdate(); //*to update the table or to execute the update query*

***Example:***

&#x09;*String query = "insert into fruits values (?,?,?)";*

&#x09;*PreparedStatement ps = con.prepareStatement(query);*

&#x09;*ps.setInt(1, id);*

&#x09;*ps.setString(2, fruitName);*

&#x09;*ps.setDouble(3,price);*	

&#x09;*ps.executeUpdate();*





***USING Prepared Statement for select***

***Example:***

&#x09;*String query = "Select \* from employees where eid= ?";*

&#x09;*PreparedStatement ps = con.prepareStatement(query);*

&#x09;*ps.setInt(1, eid);*

&#x09;*ResultSet rs = ps.executeQuery();*

&#x09;*Employee employee = new Employee();*

&#x09;*while(rs.next()) {*

&#x09;	*employee.setEid(rs.getInt("eid"));*

&#x09;	*employee.setEname(rs.getString("ename"));*

&#x09;	*employee.setSalary(rs.getLong("salary"));*

&#x09;	*employee.setEmail(rs.getString("email"));*

&#x09;	*employee.setMobile(rs.getString("mobile"));*

&#x09;	*employee.setDoj(rs.getDate("doj").toLocalDate());*

&#x09;	*employee.setDob(rs.getDate("dob").toLocalDate());*

&#x09;*}*



***To Call a procedure***

CallableStatement cs = con.prepareCall(query);

***Example:*** 

&#x09;*String query= "{call get\_all\_students()}";*

&#x20;       *CallableStatement cs = con.prepareCall(query);*



#### **METHOD 2 (Hibernate)**



**To create a session using xml**

*SessionFactory sf = new Configuration().configure().buildSessionFactory(); // in configure() you pass hibernate.cfg.xml file if name is other than hibernate.cfg.cml this file contains all your database related data.* 



*// it work on the Models or Entities (Class) which are bean either by @Entity or by hibernate-mapping in model\_name.hbm.xml. You just need to map them in hibernate.cfg.xml either using mapping resource from model\_name.hbm.xml or using mapping class with fully qualified name (must have @Entity on class if just using qualified name and not a separate xml file). -------- Day16 Spring Hibernate Prj*





**To create a session using applicaton.properties**

*Properties properties = new Properties();*

*InputStream inputStream = HibernateUtil.class.getClassLoader().getResourceAsStream("application.properties");  // **here instead of HibernateUtil give the className where you are creating the session***

*properties.load(inputStream);*

*Configuration configuration = new Configuration();*

*configuration.setProperties(properties);*

*configuration.addAnnotatedClass(Citizen.class);*

*configuration.addAnnotatedClass(AadharCard.class);*	

*SessionFactory sf = configuration.buildSessionFactory();*







*To Perform any operation you must open the session and then close it afterward. And use Transaction for any database changes*



***To Open Session***

*Session session = sf.openSession()*



**READ**

*session.createQuery("From MODEL\_NAME",MODEL\_NAME.class) // convert it to list .list() for use in java*

*session.get(MODEL\_NAME.class, id); //to get a single object from database here id should be the primary key*



**INSERT**

*Transaction tx = session.beginTransaction();*

*session.persist(object); //here object is the value to be inserted*

*tx.commit();*



**UPDATE**

*Transaction tx = session.beginTransaction();*

*session.merge(object); //here object is the value to be updated*

*tx.commit();*



**DELETE**

*Transaction tx = session.beginTransaction();*

*session.remove(object); //here object is the value to be updated*

*tx.commit();*









#### **METHOD 3 (Springframework JDBC Template, Still SQL)**

**To Connect with database**

*DriverManagerDataSource ds = new DriverManagerDataSource();*

*ds.setDriverClassName("com.mysql.cj.jdbc.Driver");*

*ds.setUrl("jdbc:mysql://localhost:3306/coforge\_db");*

*ds.setUsername("username");*

*ds.setPassword("password");*



***JdbcTemplate jdbc =*** <i>new JdbcTemplate(ds);</i>



**READ**

*String query = "SELECT \* FROM \_emp\_tab";*

*RowMapper<Employee> rowMapper = (row,rowNum)->{ // RowMapper is used to convert a row of sql to the respective object. It must return a object from each row.*

&#x09;*Employee e = new Employee();*

&#x09;*e.setEmpId(row.getLong("empId"));*

&#x09;*e.setEname(row.getString("ename"));*

&#x09;*e.setSalary(row.getDouble("salary"));*

&#x09;*return e;*

*};*

*jdbcTemplate.query(query, rowMapper);*





**To read single object:**

*String query = "SELECT \* FROM emp\_tab WHERE empId = ?";*

*RowMapper<Employee> rowMapper = (rs,rowNum)->{*

&#x09;*Employee e = new Employee();*

&#x09;*e.setEmpId(rs.getLong("empId"));*

&#x09;*e.setEname(rs.getString("ename"));*

&#x09;*e.setSalary(rs.getDouble("salary"));*			

&#x09;*return e;*

*};*

*jdbcTemplate.queryForObject(query, rowMapper,empId);*



**INSERT**

*String query = "INSERT INTO table\_name (col1,col2,col3) VALUES (?,?,?)";*

*jdbcTemplate.update(query,val1,val2,val3);*



**UPDATE**

*String query = "UPDATE table\_name col1=?, col2=?, col3=? WHERE col4=?";*

*jdbcTemplate.update(query,val1,val2,val3,val4);*



**DELETE**

*String query = "DELETE FROM table\_name WHERE col1=?";*

*jdbcTemplate.update(query,val1);*







#### **METHOD 4 (Spring Repository)**

**For this it just needs a spring boot project** with configuration in the application.properties

After that just extend JpaRepository<Model,PrimaryKeyName> to get repository methods

**READ**

*repository.findAll();*

*repository.findById(id);*



**INSERT**

*repository.save(object);*



**UPDATE**

*repository.save(object);*



**DELETE**

*repository.deleteById(id);*





**------------------------------------------------------------------------------------------------------------------------------------------------------------**



**HTTP SERVLET REQUEST**

**Get Parameter:** To get the parameter values (url?paramName=paramValue)

***Example:*** 

&#x09;*request.getParameter("num1");*



**Set Attribute:** To set the a variable value to be used in the jsp page.

***Example:***

&#x09;*request.setAttribute("names",names);*



**Get Request Dispatcher:** To get a jsp page from webapp folder.

***Example:*** 

&#x09;*rd = request.getRequestDispatcher("employee-form.jsp");*

&#x09;*rd.forward(request, response); //To pass the page to frontend.*



**HttpSession:** It is an session to store some data

***Example:*** 

&#x09;*HttpSession session = request.getSession();  // if do not want the creation of a new session here then use request.getSession(false);*	

&#x09;*session.setAttribute("email",email); //to set the data*

&#x09;*session.setMaxInactiveInterval(300); //to set the session validity in ms*

&#x09;*session.invalidate(); // to empty session*



**HTTP SERVLET RESPONSE**

**PrintWriter**: To print something in response or HttpServletResponse. It is generated generally from the HttpServletResponse using .getWriter() method

***Example:*** 

&#x09;*PrintWriter out= response.getWriter();*

&#x09;*out.println("<body style='background:yellow;' >");*

&#x09;*out.println("<h1 style=color:red; >Hello servlet......</h1>");*

&#x09;*out.println("</body>");*

&#x09;*out.close();*





**Redirect:** It is a property of the HttpServletResponse Object

***Example:***

&#x09;*response.sendRedirect("success.jsp"+"?uname=gaurav");*



