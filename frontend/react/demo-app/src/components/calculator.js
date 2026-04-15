import { useState } from "react";

export default function Calculator() {
    const [data,setData]=useState({
        num1:0,
        num2: 0,
        op: '',
        res: 0
    })

    let handleChange = (e) => {
        setData({ ...data, [e.target.name]: e.target.value });
    }

    let calculate=(e)=>{
        e.preventDefault();
        switch (data.op) {
            case "+":
                setData({...data,res:Number(data.num1)+Number(data.num2)})
                break;
            case "-":
                setData({...data,res:Number(data.num1)-Number(data.num2)})
                break;
            case "*":
                setData({...data,res:Number(data.num1)*Number(data.num2)})
                break;
            case "/":
                setData({...data,res:Number(data.num1)/Number(data.num2)})
                break;
        
            default:
                break;
        }
    }

    return(
        <>
            <div>
                <h1>Result: {data.res}</h1>
                <form onSubmit={calculate}>
                    <label htmlFor="num1">Number 1</label>
                    <input type="number" id="num1" name="num1" onChange={handleChange} value={data.num1} />
                    
                    <label htmlFor="num2">Number 2</label>
                    <input type="number" id="num2" name="num2" onChange={handleChange} value={data.num2} />

                    <label htmlFor="op">Operator</label>
                    <select name="op" id="op" onChange={handleChange} >
                        <option value={""} >Select Operator</option>
                        <option value={"+"}>+</option>
                        <option value={"-"}>-</option>
                        <option value={"*"}>*</option>
                        <option value={"/"}>/</option>
                    </select>


                    <button>Calculate</button>
                </form>
            </div>
        </>
    )
}