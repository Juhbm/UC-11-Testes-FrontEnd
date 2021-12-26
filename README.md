# UC-11-Testes-FrontEnd

RELATÓRIO
(CAMPO DE BUSCA DO SITE SENAI-SP)

Na atividade realizada foi criado o desenho do teste (código em linguagem java) para a automação de busca da palavra "gestão" no site do senai-sp: https://online.sp.senai.br/.
Criou-se as devidas instalações e importações necessárias dentro da IDE Eclipse, utlizando dependências da ferramenta de automação Maven e o ChromeDriver, uma ferramenta
de código aberto utilizada para a comunicação da dependência selenium com o Google Chrome..

Após toda configuração e estruturação do código foi observada que a execução do teste ocorreu corretamente e em tempo hábil, sem travamentos. Porém, observou-se que
a frase do site que relaciona a quantidade de resultados encontrados, expressa a quantidade de "0"(zero) resutaldos encontrados, sendo que há 3 resultados de cursos
referente a palavra gestão. Supõe-se que é um erro interno de programação onde não foi devidamente programada a condição para exibir o número real de resultados encontrados.
Esse erro deve ser corrigido pois emite divergência de informação no resultado e pode confundir o usuário/cliente. Segue abaixo a imagem referente ao erro(bug).


<div align="center">
<img src="https://user-images.githubusercontent.com/88734340/147393719-f06e26f6-2e55-4f1d-bfb4-fea946528e01.png" width="700px" />
</div>

RELATÓRIO
(FUNCIONALIDADES DA PÁGINA LOGIN DO PROJETO GAME MANIA)

Nesta atividade, foram testados: o acesso a página de login (função do click no botão da minha conta) e a verificação de senhas (errada, curta, vazia e correta).

Ao realizar automação observou-se que ao acessar o site o click no link do ícone Minha Conta ocorreu perfeitamente.
Cada senha demonstrada (mediante um laço de repetição for) apresenta, no console da IDE Eclipse o resultado corretamente da mensagem de senha: incorreta, curta e correta. A mensagem do campo da senha vazia não apareceu no console pois a condição é que se mensagem for diferente de vazia, emite a mensagem, como independente das senhas erradas ou curtas o campo não ficava vazio, logo a mensagem de cada situação é exibida.

Sendo assim, o teste realizado para as funções propostas foi efetuado com sucesso.
