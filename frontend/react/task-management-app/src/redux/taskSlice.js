import { createSlice } from "@reduxjs/toolkit"

const initialState={
    tasks:[]
}

const taskSlice=createSlice({
    name:"task",
    initialState,
    reducers:{
        addTask:(state,action)=>{
            state.tasks.push(action.payload);
        },
        changeTaskStatus:(state,action)=>{
            const {id,status}=action.payload;
            const task = state.tasks.find(t=>t.id===id);
            if(task){
                task.status = status;
            }
            // state.tasks = state.tasks.map(t=>{
            //     if(t.id===id){
            //         t.status=status;
            //     }

            //     return t;
            // });
            // state.tasks = [...state.tasks];
            // console.dir(state.tasks)
        }
    }
})

const taskReducer = taskSlice.reducer;
export default taskReducer;
export const {addTask,changeTaskStatus} = taskSlice.actions;