import { useState } from "react"

export const Login= ()=>{
    const [user,setUser]=useState({
        uname:'',
        pwd:''
    })

    const handleChange = (e)=>{
        setUser({...user,[e.target.name]:e.target.value});
    }

    const handleLogin = (e)=>{
        e.preventDefault();
        if(user.uname==="gaurav"&&user.pwd==="gaurav123")
            alert("Logged in successfully")
        else
            alert("Invalid Credentials")
    }

    return(
        <div>
            <form>
                <label htmlFor="uname">Username</label>
                <input type="text" name="uname" id="uname" value={user.uname} onChange={handleChange} />
                <label htmlFor="pwd">Password</label>
                <input type="password" name="pwd" id="pwd" value={user.pwd} onChange={handleChange} />
                <button onClick={handleLogin} >Login</button>
            </form>
        </div>
    )
}