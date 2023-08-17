public class Main {
    public static ITesteService _service;
    public Main(ITesteService testeService){
        this._service = testeService;
    }

    /**
     * Método de entrada da aplicação.
     * @retorno vazio
     * @autor Daniel
     */
    public static void main(String[] args) {
        System.out.println("Alô mamãe!");

        /*
         * O que precisamos rever?
         *
         * Declaração, inicialização e utilizaão de variáveis
         * tipos de Dados
         * Operadores matemáticos
         * Operadores compostos += -= *= /= cuidado com as precedências.
         * operadores unários ++ --  x++(retorna depois itera) ++x(itera depois retorna)
         * Operadores de comparação
         * Operadores lógicos && || ! ^ (^ ou exclusivo)
         * instrução if/else
         * instrução switch/case
         * opedador ternário
         * opedador ternário
         */

        _service.setNome("Macuca");
        var bool = _service.testeNome("Biribinha");

        for(String nome = "Biribinha"; nome.charAt(0) == 'B';)
        {
        }

        System.out.println(bool);
    }
}