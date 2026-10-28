# VALIDADOR DE SENHA

Avaliador de senhas em Java, desenvolvido para o Sr. Montanha. O programa pede senhas ao usuário até que todas as regras sejam atendidas ou o usuário digite `SAIR`.

## Regras de Validação

**Tamanho:** Mínimo de 8 caracteres.

**Números:** Pelo menos um dígito.

**Senhas Óbvias:** Bloqueio de senhas comuns (`12345678`, `senha123`, `admin123`).

**Maiúsculas:** Pelo menos uma letra maiúscula.

## Como Executar

Execute o arquivo App.java em uma IDE compatível com Java ou pelo terminal.

Digite uma senha fictícia quando solicitado.

Siga as orientações exibidas pelo programa até que a senha seja aprovada.

Para encerrar, digite SAIR.

## Casos de Teste

 ID - Entrada fictícia - Resultado obtido -

T01 - Vazia - DICA: A senha deve ter no mínimo 8 caracteres. 
T02 - batata - DICA: A senha deve ter no mínimo 8 caracteres. 
T03 - Abcdef1 - DICA: A senha deve ter no mínimo 8 caracteres.  
T04 - Abcdefgh - DICA: Adicione pelo menos um número à sua senha. 
T05 - abcdefgh - DICA: Adicione pelo menos um número à sua senha. 
T06 - 12345678 - ALERTA: Esta senha é muito comum ou óbvia. 
T07 - senha123 - ALERTA: Esta senha é muito comum ou óbvia. 
T08 - admin123 - ALERTA: Esta senha é muito comum ou óbvia. 
T09 - abcdefgh1 - DICA: Adicione pelo menos uma letra maiúscula à sua senha. 
T10 - Abcdefg1 - SUCESSO: Sua senha passou nos critérios básicos! 
T11 - Senha123 - SUCESSO: Sua senha passou nos critérios básicos! 
T12 - Cachorro_Verd3! - SUCESSO: Sua senha passou nos critérios básicos! 

## Reflexão Final

Embora o programa valide regras básicas, passar por esses critérios não garante uma senha imune a ataques. Cibercriminosos utilizam diversos metodos e força bruta que quebram facilmente senhas curtas, mesmo com números e maiúsculas, especialmente se usarem datas, nomes ou substituições previsíveis. A responsabilidade do desenvolvedor vai muito além de impor regras, envolve educar o usuário com mensagens claras sobre a necessiddade de uma senha "forte" e segura, e fundamentalmente, garantir a segurança por trás das telas usando algoritmos robustos, que "forcem" o usuário a criar senhas fortes, para que o programa tenha proteção contra tentativas repetidas do usuário. Passar nestas quatro regras básicas não garante uma senha imune a ataques, pois o usuário pode criar algo como "Abcdefg1", que passa na validação, mas utiliza uma sequência muito previsível.
