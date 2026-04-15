import { useEffect, useState } from "react";
import Customer from "./customer";
import { useNavigate, useParams } from "react-router-dom";

export default function EditCustomer({ customers, setCustomers }) {
    const { id } = useParams();
    const [customer, setCustomer] = useState(new Customer(0, "", ""));
    const navigate = useNavigate();
    
    const handleChange = (e) => {
        const { name, value } = e.target;
        setCustomer({ ...customer, [name]: value });
    }

    useEffect(() => {
        console.log(customers)
        const cust = customers.find((c) => Number(c.id) === Number(id));
        setCustomer(cust);
    }, [])

    const editCustomer = (e) => {
        e.preventDefault();
        // setCustomers([...customers.filter(c=>c.id!==id), customer]);
        setCustomers(customers.map(c=>Number(c.id)===Number(id)?new Customer(customer.id,customer.name,customer.city):c))
        alert("Customer Editted");
        navigate("/")
    }
    return (
        <>
            <div className="container-fluid">
                <div className="card p-4 shadow">
                    <h2>Edit Customer</h2>
                    {customer?<form onSubmit={editCustomer}>
                        <div className="mb-2">
                            <label className="form-label" htmlFor="id">Customer Id</label>
                            <input type="text" className="form-control" name="id" value={customer.id} onChange={handleChange} id="id" />
                        </div>
                        <div className="mb-2">
                            <label className="form-label" htmlFor="name">Customer Name</label>
                            <input type="text" className="form-control" name="name" value={customer.name} onChange={handleChange} id="name" />
                        </div>
                        <div className="mb-2">
                            <label className="form-label" htmlFor="city">City</label>
                            <input type="text" className="form-control" name="city" value={customer.city} onChange={handleChange} id="city" />
                        </div>
                        <button className="btn btn-primary">Edit</button>
                    </form>:""}
                </div>
            </div>
        </>
    )
}