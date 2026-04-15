import { Link } from "react-router-dom";

export default function CustomersList({ customers , setCustomers}) {
    const deleteCustomer = (id)=>{
        setCustomers(customers.filter(c=>Number(c.id)!==Number(id)));
    }
    return (
        <>
            <div className="card py-2">
                <table className='table table-striped'>
                    <thead>
                        <tr>
                            <th>Id</th>
                            <th>Name</th>
                            <th>City</th>
                            <th>Actions</th>
                        </tr>
                    </thead>
                    <tbody>
                        {customers.map((cust, index) => (
                            <tr key={index}>
                                <td>{cust.id}</td>
                                <td>{cust.name}</td>
                                <td>{cust.city}</td>
                                <td>
                                    <div className="d-flex gap-2" >
                                        <Link to={`/edit/${cust.id}`}><button className="btn btn-primary" >Update</button></Link>
                                        <Link to={`/view/${cust.id}`}><button className="btn btn-info" >View</button></Link>
                                        <button onClick={()=>deleteCustomer(cust.id)}  className="btn btn-danger" >Delete</button>
                                    </div>
                                </td>
                            </tr>
                        ))}
                    </tbody>
                </table>
            </div>
        </>
    )
}