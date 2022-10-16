import React from 'react';
import Stock from './pages/Stock';
import './App.css';
import Navbar from './NavbarComponents';
import Home from './pages/index';
import SignUp from './pages/signup';
import LogInPage from './pages/login'; 
import { BrowserRouter as Router, Routes, Route}
    from 'react-router-dom';
import {useEffect} from 'react'
import Plots from './pages/Plots';



function App() {
  

  useEffect(() => {
    //do something on load
    console.log("Hey I have loaded up");

    fetch("http://localhost:8080/api/items")
    .then((response) => response.json())
    .then((todoItems) => {
    console.log(todoItems);
  });
});

  return (
    <div className="App">

      <Router>
      <Navbar />
      <Routes>
          <Route path='/index' element={<Home />} />
          <Route path='/login' element={<LogInPage/>} />
          <Route path='/signup' element={<SignUp/>} />
          <Route path='/Plots' element={<Plots/>} />
      </Routes>
      </Router>
      
    </div>
    
  );
}
export default App;
