import { BrowserRouter, Navigate, Route, Routes } from "react-router-dom";
import PatientListing from "./routes/PanelManager/PatientListing";
import PanelManager from "./routes/PanelManager";
import Dashboard from "./routes/PanelManager/Dashboard";
import ProfessionalListing from "./routes/PanelManager/ProfessionalListing";

export default function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<PanelManager />}>
          <Route index element={<Dashboard />} />
          <Route path="patients" element={<PatientListing />} />
          <Route path="professionals" element={<ProfessionalListing />} />
          <Route path="procedures" element={<PatientListing />} />
          <Route path="*" element={<Navigate to={"/"} />} />
        </Route>
        
      </Routes>
    </BrowserRouter>
  );
}
