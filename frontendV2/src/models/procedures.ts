export type ProcedureDTO = {
  id_procedure: number;
  data: string;
  start: string;
  finish: string;
  type: string;
  status: string;
  description: string;

  id_professional: number;
  id_patient: number;
  id_manager: number;
};
