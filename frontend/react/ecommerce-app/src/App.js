import logo from './logo.svg';
import './App.css';
import { Navbar } from './components/navbar';
import { useReducer } from 'react';
import { Cart, CartReducer } from './components/CartReducer';
import { ProductsList } from './components/products';
import { CartComponent } from './components/cart';

function App() {
  const [cart, dispatcher] = useReducer(CartReducer, Cart);

  return (
    <div className="App">
      <Navbar />
      <div className='d-flex gap-4'>
        <ProductsList dispatcher={dispatcher} />
        {/* <CartComponent cart={cart} dispatcher={dispatcher} /> */}
        <div className="border" style={{ width: "100%" }}>
          <h2>Cart</h2>
          {cart.products.map(p => (
            <div>
              <h3>{p.name} - {p.price} * {p.quantity} </h3>
              <button onClick={() => dispatcher({ type: "increase", productId: p.id })} >+</button>
              <button onClick={() => dispatcher({ type: "decrease", productId: p.id })} >-</button>
              <button onClick={() => dispatcher({ type: "remove", productId: p.id })} >Remove</button>
            </div>
          ))}

          <div>
            Total Cost = {cart.cost}
          </div>
        </div>
      </div>
    </div>
  );
}

export default App;
