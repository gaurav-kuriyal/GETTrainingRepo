import { Component, useEffect, useState } from "react"

export default function CounterWithUseEffect() {

    const [count,setCount]=useState(0);

    useEffect(()=>{
        console.log("Component Mounted");

        return ()=>{
            console.log("Component unmounted")
        }
    },[])

    useEffect(()=>{
        console.log("Component Updated, count: ",count);
    },[count])

    return <>
        <div><h1>{count}</h1></div>
        <button onClick={()=>setCount(count+1)}>Increase</button>
    </>
}