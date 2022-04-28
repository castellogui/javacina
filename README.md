# Javacina 💉

## Conceito <img src="https://media.giphy.com/media/hvRJCLFzcasrR4ia7z/giphy.gif" width="25px">
Projeto realizado no primeiro semestre do curso de Análise e desenvolvimento de sistemas.
Tinhamos como objetivo criar um software que pudesse auxiliar os atendentes em uma fila de vacinação, onde os usuários são administradores ou atendentes. Podemos cadastrar
pessoas para se vacinar, transferi-las para área de vacinados, cadastrar administradores e atendentes, alternar entre os tipos de usuários, e editar suas informações. 
Todas as funionalidades são registradas em um banco de dados relacional MySQL, onde o script está disponível no repositório.

## 💻 Rotinas do Software
O projeto proposto pela faculdade foi realizar um programa que pudesse cadastrar e gerenciar pessoas numa fila de vacinação. O software deveria diferenciar administradores de atendentes, e cada um teria sua respectiva função. 
Administradores poderiam cadastrar, editar e exluir atendentes (usuários) e inserir pessoas na fila de vacinação, bem como criar relatórios com dados das pessoas já vacinadas. 
Já os atendentes, ficavam responsáveis por visualizar a fila de vacinação, vacinar as pessoas na fila e validar a mesma.

### Login
![image](https://user-images.githubusercontent.com/78494604/165773163-d48f2ccd-bdb2-47bb-990b-7ecc3a8126b0.png)

É possível realizar o login por meio da interface acima. O programa diferencia maiusculas e minúsculas para realizar o login corretamente.

### Dashboard Administrador
![image](https://user-images.githubusercontent.com/78494604/165773112-38f2cb6f-f40b-4f2a-b2ef-826b676ca94f.png)

Ao logar no programa como um administrador, é possível visualizar as três funções principais do programa. Controle de Acesso, Cadastrar Pessoas a Fila de Vacinação e Gerar Relatórios.

### Leitura e Pesquisa de Usuários
![image](https://user-images.githubusercontent.com/78494604/165773030-b69f24d4-7df3-4223-86af-26ffced8c2c5.png)

O Controle de Acesso permite a criação, edição e exclusão de usuários, e pesquisa por id, nome, email, usuário e permissão.

![image](https://user-images.githubusercontent.com/78494604/165773074-806d2640-2611-44fd-b799-f5ad1b9b62d5.png)

Também existe um botão para atualizar a tabela caso outro administrador altere o registro de um usuário, bem como o botão de logout.

### Interface de Adição de Usuários
![image](https://user-images.githubusercontent.com/78494604/165772906-677bffe9-f3f9-429d-9c50-df543b1941c5.png)

Ao clicar no botão de adicionar usuário, uma tela de cadastro se sobrepõe a tela original, e é possível cadastrar as informações do novo usuário, só sendo possível cadastrar ao preencher as informações corretamente de acordo com as validações de e-mail, usuário e senha.

### Interface de Edição de Usuários
![image](https://user-images.githubusercontent.com/78494604/165772830-c2d14c38-b944-4cd5-a13f-e362c313a9e5.png)

Na tela de edição de cadastro, é possivel alterar qualquer tipo de informação com exceção da ID do usuário.

### Confirmação de Exclusão/Alterar Usuários
![image](https://user-images.githubusercontent.com/78494604/165772782-2c395e0e-1f27-4889-a93c-4ad97e74b021.png)

Ao clicar em excluir registro, uma confirmação sobrepõe a tela principal, e dependendo da escolha do usuário, o registro é excluído.

### Interface de Cadastro de Pessoas a Fila
![image](https://user-images.githubusercontent.com/78494604/165774776-90438139-f093-425b-9b59-b0d5f6a11ef4.png)

Ao entrar no menu de Cadastro de Pessoas à Fila de Vacinação, é possível cadastrar uma pessoa na fila, que serão gerenciados pelos atendentes.

![image](https://user-images.githubusercontent.com/78494604/165774810-c5d1609d-217a-4a9d-9951-c32004edfb39.png)

Também existe uma confirmação sobre os dados que serão adicionados na fila.

### Interface de Geração de Relatórios
![image](https://user-images.githubusercontent.com/78494604/165772533-2c3a6bdf-3eff-4f69-afa2-5565e1ced902.png)

Na interface de geração de relatório, é possível definir parâmetros para o relatório.

![image](https://user-images.githubusercontent.com/78494604/165774400-45fbde52-15f5-4fa9-af5f-26cfea47eda3.png)

Ao clicar em gerar o relatório, é possivel extrair um PDF com as mesmas informações. Abrindo um explorador de arquivos para selecionar o local para salvar o arquivo.

### Dashboard Atendente
![image](https://user-images.githubusercontent.com/78494604/165774984-a6a1a956-8f33-4dd9-a174-5587b87c6460.png)

No dashoard do atendente é possivel atualizar a lista para verificar a inserção de outra pessoa na fila de vacinação. 

![image](https://user-images.githubusercontent.com/78494604/165775048-2ff91727-9d08-4f83-8e31-82befd013a66.png)

Ao selecionar a pessoa e clicar no botão de Vacinar, uma confirmação se sobrepõe a tela do dashboard para perguntar ao usuário se a pessoa deve ser vacinada.

### Validação de Vacinação
![image](https://user-images.githubusercontent.com/78494604/165775118-d8dfe8f9-7bcb-4b18-90df-ea1c14b83bb5.png)

Ao clicar em Validar, a interface de validação de vacinação perite visualizar as pessoas já vacinadas, lista que preencherá o relatório.
