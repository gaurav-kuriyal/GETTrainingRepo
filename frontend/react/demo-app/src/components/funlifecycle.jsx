import { Component, useEffect, useState } from "react"

export default function FunLifeCycle() {

    const [name,setName]=useState("Guarav")

    useEffect(()=>{
        console.log("Component Mounted");

        return ()=>{
            console.log("Component unmounted")
        }
    },[])

    useEffect(()=>{
        console.log("Component Updated");
    },[name])

    return <>
        <div><h1>{name}</h1></div>
        <button onClick={()=>setName("Gaurav Kuriyal")}>Change</button>
    </>
}