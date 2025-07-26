import React from "react";
import "./GradeSheet.css";

function Gradesheet({ Name, School, Total, Goal }) {
  const CalcScore = (total, goal) => {
    return (total / goal).toFixed(2);
  };
  return (
    <div className="flex">
      <h1>Student Gradesheet</h1>
      <table cellSpacing={10}>
        <tbody>
          <tr>
            <td className="field">Student Name</td>
            <td className="value">{Name}</td>
          </tr>
          <tr>
            <td className="field">Student School</td>
            <td className="value">{School}</td>
          </tr>
          <tr>
            <td className="field">Total Marks</td>
            <td className="value">{Total}</td>
          </tr>
          <tr>
            <td className="field">Score</td>
            <td className="value">{CalcScore(Total, Goal)}</td>
          </tr>
        </tbody>
      </table>
    </div>
  );
}

export default Gradesheet;
