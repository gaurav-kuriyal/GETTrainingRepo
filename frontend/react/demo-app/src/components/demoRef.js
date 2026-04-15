import { useRef, useState } from "react";

export default function DemoRef() {
    const nameRef = useRef();

    const[name,setName] = useState("")

    let focusName = ()=>{
        nameRef.current.focus();
    }
    
    let getName = ()=>{
        setName(nameRef.current.value);
    }
    return(<>
        <div>
            <h1>Demo on useRef</h1>
            <h2>{name}</h2>
            <input type="text" ref={nameRef} placeholder="Enter name" />
            <button onClick={focusName}>Focus</button>
            <button onClick={getName}>Get Name</button>
        </div>
    </>)
}