import logo from './logo.svg';
import './App.css';
import EnhancedComponent from './components/enhanced';
import Hello from './components/hello';

const EnhancedHelloComponent = EnhancedComponent(Hello,"Gaurav");
const EnhancedHelloComponent2 = EnhancedComponent(Hello,"Rajat");
function App() {
  return (
    <div>
      <EnhancedHelloComponent />
      <EnhancedHelloComponent2/>
    </div>
  );
}

export default App;
