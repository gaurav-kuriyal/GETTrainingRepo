import { useEffect, useState } from "react";
import { useParams } from "react-router-dom";
import Customer from "./customer";
import api from "../services/api";

export default function ViewCustomer() {
    const { id } = useParams();

    const [customer, setCustomer] = useState(new Customer(id, "", ""));

    useEffect(() => {
       api.get(`/customers/${id}`).then((res)=>{
        setCustomer(res.data)
       }).catch(err=>{
        console.error(err)
       })
        
    }, [id])

    return (
        <>
            <div className="card">
                {customer ? <table className="table table-striped">
                    <tbody>
                        <tr>
                            <th>Id</th>
                            <td>{customer.id}</td>
                        </tr>
                        <tr>
                            <th>Name</th>
                            <td>{customer.name}</td>
                        </tr>
                        <tr>
                            <th>City</th>
                            <td>{customer.city}</td>
                        </tr>
                    </tbody>
                </table> : ""}
            </div>
        </>
    )
}