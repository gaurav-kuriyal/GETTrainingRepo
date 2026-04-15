// import logo from './logo.svg';
import './App.css';
import Calculator from './components/calculator';
import CheckNumber from './components/checkNumber';
import Counter from './components/counter';
import CounterWithUseEffect from './components/counterWithUseEffect';
import DemoRef from './components/demoRef';
import FunComponent from './components/funComponent';
import FunLifeCycle from './components/funlifecycle';
import Hello from './components/hello';
import LifeCycle from './components/lifecycle';
import Login from './components/login';
import Welcome from './components/welcome';

function App() {
  return (
    <div className="App">
      {/* <Hello myname="Gaurav Kuriyal" />
      <Counter />
      <CheckNumber /> */}
      {/* <Welcome myname="Gaurav Kuriyal" />
      <FunComponent /> */}
      {/* <Login /> */}
      {/* <Calculator /> */}
      {/* <DemoRef /> */}
      {/* <LifeCycle /> */}
      {/* <FunLifeCycle /> */}
      <CounterWithUseEffect />
    </div>
  );
}

export default App;
