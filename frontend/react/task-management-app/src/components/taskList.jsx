import { useSelector } from "react-redux"
import { UpdateTaskComponent } from "./updateTaskStatus";

export function TaskList(){
    const tasks = useSelector((state)=>state.task.tasks);
    return(<>
        <div>
            <h1>Task List</h1>
            {tasks.length==0?"No Tasks":
                tasks.map((t,index)=>(
                    <div key={index}>
                        <p>{t.id}</p> <h1>{t.name}</h1>
                        <p>{t.status}</p>
                        <UpdateTaskComponent task={t} />
                    </div>
                ))
            }
        </div>
    </>)
}