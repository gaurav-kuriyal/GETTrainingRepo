import logo from './logo.svg';
import './App.css';
import { useReducer, useState } from 'react';
import { UserProfile } from './components/userProfile';
import { UserStatus } from './components/userStatus';
import { UserList } from './components/userList';
import { User, UserReducer } from './components/userReducer';

function App() {
  const [user, dispatcher] = useReducer(UserReducer,User);
  return (
    <div className="App">
      <div>
        <h1>User App</h1>
        <h3>id: {user.id}</h3>
        <h3>name: {user.name}</h3>
        <h3>role: {user.role}</h3>
        <h3>status: {user.status}</h3>
      </div>
      <UserList dispatcher={dispatcher} />
      <UserProfile user={user} dispatcher={dispatcher} />
      <UserStatus user={user} dispatcher={dispatcher} />
    </div>
  );
}

export default App;
