import { useState } from "react"

export default function FunComponent(props) {
    const [count,setCount] = useState(0);
    return(
        <>
            <div>
                <h1>{count}</h1>
                <button className="btn btn-success" onClick={()=>setCount(count+1)}>+</button>
                <button className="btn btn-danger" onClick={()=>setCount(count-1)}>-</button>
                <button className="btn btn-primary" onClick={()=>setCount(0)}>Reset</button>
            </div>
        </>
    )
}