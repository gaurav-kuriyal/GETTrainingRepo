import './App.css';
import { useEffect, useState } from 'react';
import AddCustomer from './components/addCustomer';
import CustomersList from './components/customersList';
import { BrowserRouter, Link, Route, Routes } from 'react-router-dom';
import EditCustomer from './components/editCustomer';
import ViewCustomer from './components/viewCustomer';
import Customer from './components/customer';
import api from './services/api';
// import CustomerService from './services/api';

function App() {

  // const customerService = new CustomerService();
  const [customers, setCustomers] = useState([]);

  const getCustmers = async () => {
    // const data = await customerService.getCustomers();
    //  setCustomers(data);
    const response = await api.get("/customers");
    setCustomers(response.data);
  }
  
  useEffect(()=>{
    getCustmers();
  },[])

  return (
    <>
      <BrowserRouter>
        <main className='container'>
          <nav className='card d-flex flex-row gap-2 my-2 p-2 '>
            <Link to='/add'><button className='btn btn-primary'>Add</button></Link>
            <Link to='/'><button className='btn btn-primary'>View all</button></Link>
          </nav>
          <Routes>
            <Route path='/add' element={<AddCustomer />} />
            <Route path='' element={<CustomersList customers={customers} setCustomers={setCustomers} />} />
            <Route path='/list' element={<CustomersList customers={customers} setCustomers={setCustomers} />} />
            <Route path='/edit/:id' element={<EditCustomer customers={customers} setCustomers={setCustomers} />} />
            <Route path='/view/:id' element={<ViewCustomer />} />
          </Routes>
        </main>
      </BrowserRouter>
    </>
  );
}

export default App;
