import { useState } from "react";

export default function Login() {
    const [loginData, setLoginData] = useState({
        username: "",
        password: ""
    })

    let handleChange = (e) => {
        setLoginData({ ...loginData, [e.target.name]: e.target.value });
    }

    let loginUser = (e) => {
        e.preventDefault();
        if (loginData.username == "gaurav" && loginData.password == "gaurav@123") {
            alert("Logged in Successfully");
            setLoginData({
                username: "",
                password: ""
            })
        } else{
            alert("Invalid Credentials");
        }
    }

    return (
        <>
            <div>
                <form onSubmit={loginUser} >
                    <label htmlFor="username">User Name</label>
                    <input type="text" id="username" name="username" onChange={handleChange} value={loginData.username} />

                    <label htmlFor="password">Password</label>
                    <input type="password" id="password" name="password" onChange={handleChange} value={loginData.password} />

                    <button>
                        Submit
                    </button>
                </form>
            </div>
        </>
    )
}