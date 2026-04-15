import { useState } from "react"
import Customer from "./customer"
import api from "../services/api";
import { useNavigate } from "react-router-dom";

export default function AddCustomer(){
    const[customer,setCustomer]=useState(new Customer(0,"",""));
    const navigate = useNavigate();
    const handleChange=(e)=>{
        const {name,value}=e.target;
        setCustomer({...customer,[name]:value});
    }

    const addCustomer=(e)=>{
        e.preventDefault();
        api.post("/customers",customer).then((res)=>{
            navigate("/")
        }).catch(err=>{
            console.error(err)
        })
        // setCustomers([...customers,new Customer(Number(customer.id),customer.name,customer.city)]);
        setCustomer(new Customer(Number(customer.id)+1,"",""))
    }
    return(
        <>
            <div className="container-fluid">
                <div className="card p-4 shadow">
                    <h2>Add Customer</h2>
                    <form onSubmit={addCustomer}>
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
                        <button className="btn btn-primary">Add</button>
                    </form>
                </div>
            </div>
        </>
    )
}