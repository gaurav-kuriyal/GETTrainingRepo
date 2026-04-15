import logo from './logo.svg';
import './App.css';
import Hello from './component/HelloComponent';
import GetUser from './component/GetUser';
import Welcome from './component/Welcome';
import Counter from './component/Counter';
import { Login } from './component/Login';

function App() {

  const user={
    id: 1,
    name: "Gaurav",
    city: "Hyd"
  }

  return (
    <div className="App">
      {/* <Welcome />
      <Counter />
      <Hello name="Shyam" /> */}
      <Login />
      {/* <GetUser user={user} /> */}
    </div>
  );
}

export default App;
