import { useDispatch } from "react-redux";
import { Task } from "../models/Task";
import { addTask } from "../redux/taskSlice";
import { useState } from "react";

export function AddTaskComponent(){
    // const [id,setId] = useState(0);
    const [name,setName] = useState("");
    const dispatch = useDispatch();

    const handleAddTask=()=>{
        const newTask= new Task(Date.now(),name,"ToDo");
        dispatch(addTask(newTask.toJSON()))
        // setId(id+1);
    }

    return (<>
        <div>
            {/* <label htmlFor="id">Id</label>
            <input type="text" placeholder="enter id" name="id" id="id" value={id} onChange={(e)=>setId(e.target.value)}/>
            <br /> */}
            <label htmlFor="name">Name</label>
            <input type="text" placeholder="enter name" name="name" id="name" value={name} onChange={(e)=>setName(e.target.value)}/>
            <button onClick={handleAddTask} >Add</button>
        </div>
    </>)
}