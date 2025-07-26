import { useState } from "react";
import reactLogo from "./assets/react.svg";
import viteLogo from "/vite.svg";
import "./App.css";
import Gradesheet from "./components/Gradesheet";

function App() {
  const [count, setCount] = useState(0);

  return (
    <>
      <Gradesheet Name="Shanmu" School="ABC School" Total={90} Goal={100} />
    </>
  );
}

export default App;
