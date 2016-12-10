CREATE TABLE tbFiscal
(
  codigo_fiscal   VARCHAR2(8) PRIMARY KEY,
  local_fiscal    VARCHAR2(40),
  cpf_fiscal      VARCHAR2(12),
  nome_fiscal     VARCHAR2(40),
  endereco_fiscal VARCHAR2(40),
  telefone_fiscal VARCHAR2(12)
);

CREATE TABLE tbDEPARTAMENTO 
(
  Sigla_dep 	varchar2(20),
  Nome_dep 	varchar2(20)
);

CREATE TABLE tbCandidato 
(    
  inscricao_candidato   VARCHAR2(8) PRIMARY KEY,
  cpf_candidato         VARCHAR2(12) NOT NULL,
  nome_candidato        VARCHAR2(40) NOT NULL,
  endereco_candidato    VARCHAR2(40) NOT NULL, 
  telefone_candidato    VARCHAR2(12), 
  email_candidato       VARCHAR2(30) 
);

CREATE TABLE tbconcurso (
    sigla_concurso            VARCHAR2(6) PRIMARY KEY,
    descricao_concurso        VARCHAR2(30) NOT NULL,
    datarealizacao_concurso   VARCHAR2(10) NOT NULL,
    taxainscricao_concurso    NUMBER(6,2) NOT NULL
);

