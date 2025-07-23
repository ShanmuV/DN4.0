import { useState } from "react";
import reactLogo from "./assets/react.svg";
import viteLogo from "/vite.svg";
import "./App.css";

// Used VITE instead of `create-react-app` since its deprecrated.

function App() {
  const [count, setCount] = useState(0);

  return <h1>My First React App!</h1>;
}

export default App;
