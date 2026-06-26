# Catálogo com JDBC 🛒

Este projeto está sendo desenvolvido para consolidar meus primeiros estudos em **JDBC (Java Database Connectivity)**. Para sair dos exercícios isolados, apliquei os conceitos criando o backend do catálogo de um mini e-commerce (gerenciamento de produtos).

O foco principal foi entender como abrir conexões com um banco de dados e realizar as operações essenciais diretamente pelo Java.

---

## 🛠️ Tecnologias Utilizadas
* **Java** 
* **JDBC** 
* **SQLite** 

---

## 🎯 Conceitos de JDBC Praticados

Mesmo sendo um projeto inicial, o código está sendo aplicado com boas práticas de desenvolvimento:

* **Operações de CRUD Completas:**
  * **C**reate: Cadastro de novos produtos no estoque.
  * **R**ead: Listagem de todos os produtos e busca por ID.
  * **U**pdate: Atualização de preços e quantidades.
  * **D**elete: Remoção de produtos do catálogo.
* **Segurança Base:** Uso de `PreparedStatement` para garantir que a inserção de dados seja segura contra SQL Injection.
* **Organização das Consultas:** Escrita de comandos SQL (`INSERT`, `SELECT`, `UPDATE`, `DELETE`) integrados ao fluxo do Java.


