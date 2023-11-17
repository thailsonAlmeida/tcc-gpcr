import { BrowserRouter, Route, Routes } from "react-router-dom";
import PatientListing from "./routes/PanelManager/PatientListing";
import PanelManager from "./routes/PanelManager";
import Dashboard from "./routes/PanelManager/Dashboard";

export default function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<PanelManager />}>
          <Route index element={<Dashboard />} />
          <Route path="patients" element={<PatientListing />} />
        </Route>
        
      </Routes>
    </BrowserRouter>
  );
}
