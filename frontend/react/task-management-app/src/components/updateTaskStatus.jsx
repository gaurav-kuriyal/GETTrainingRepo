import { useDispatch } from "react-redux";
import { changeTaskStatus } from "../redux/taskSlice";

export function UpdateTaskComponent({task}){
    const dispatch = useDispatch();
    return(<>
        <div>
            <button onClick={()=>{
                dispatch(changeTaskStatus({id:task.id,status:"ToDo"}))
            }} > ToDo</button>
            <button onClick={()=>{
                dispatch(changeTaskStatus({id:task.id,status:"Progress"}))
            }} > Progress</button>
            <button onClick={()=>{
                dispatch(changeTaskStatus({id:task.id,status:"Done"}))
            }} > Done</button>
        </div>
    </>)
}