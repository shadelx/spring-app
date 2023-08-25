import './App.css'
import { useState } from 'react'
import { Button } from 'react-bootstrap';

function App() {

  const [movies, setMovies] = useState();

  const getMovies = () => {
    alert("hello, there")
  }
  
  return (
    <>
      <h1>hello, there bababa</h1>
      <button>hello</button>
      <Button variant='warning'>hello</Button>
    </>
  )
}

export default App
