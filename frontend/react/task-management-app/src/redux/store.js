import taskReducer from "./taskSlice";
const { configureStore } = require("@reduxjs/toolkit");

export const store= configureStore({
    reducer: {
        task: taskReducer
    }
})