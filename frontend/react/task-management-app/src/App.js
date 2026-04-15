import './App.css';
import { TaskList } from './components/taskList';
import { AddTaskComponent } from './components/addTask';

function App() {

  return (
    <div className="App">
      <AddTaskComponent />
      <TaskList />
    </div>
  );
}

export default App;
