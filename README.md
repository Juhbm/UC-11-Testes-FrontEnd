# UC-11-Testes-FrontEnd

RELATÓRIO

Na atividade realizada foi criado o desenho do teste (código em linguagem java) para a automação de busca da palavra "gestão" no site do senai-sp: https://online.sp.senai.br/.
Criou-se as devidas instalações e importações necessárias dentro da IDE Eclipse, utlizando dependências da ferramenta de automação Maven e o ChromeDriver, uma ferramenta
de código aberto utilizada para a comunicação da dependência selenium com o Google Chrome..

Após toda configuração e estruturação do código foi observada que a execução do teste ocorreu corretamente e em tempo hábil, sem travamentos. Porém, observou-se que
a frase do site que relaciona a quantidade de resultados encontrados, expressa a quantidade de "0"(zero) resutaldos encontrados, sendo que há 3 resultados de cursos
referente a palavra gestão. Supõe-se que é um erro interno de programação onde não foi devidamente programada a condição para exibir o número real de resultados encontrados.
Esse erro deve ser corrigido pois emite divergência de informação no resultado e pode confundir o usuário/cliente.


<div align="center">
<img src="https://user-images.githubusercontent.com/88734340/147393719-f06e26f6-2e55-4f1d-bfb4-fea946528e01.png" width="700px" />
</div>
