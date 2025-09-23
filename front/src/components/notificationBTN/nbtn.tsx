import axios from "axios";
import nbtnIcon from "./../../assets/notification-icon.svg"
import './styNbtn.css'
import { BASE_URL } from "../../utils/request";

type Props ={
  saleId: number;
}

function handleClick(id:number){
  axios.get(`${BASE_URL}/sales/${id}/notification`).then(
    res=>{
      console.log("success", res)
    }
  )    
}

function Nbtn({saleId}: Props) {
  
  return (
    <div 
      onClick={()=>handleClick(saleId)}
      className="dsmeta-red-btn"
    >
      <img src={nbtnIcon} alt="Notificar" />
    </div>
  )
}

export default Nbtn;