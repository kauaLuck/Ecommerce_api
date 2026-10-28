package br.com.senai.techbyte;

import br.com.senai.techbyte.service.ProdutoService;
import br.com.senai.techbyte.controller.ProdutoController;
import br.com.senai.techbyte.repository.ProdutoMemoryRepository;
import br.com.senai.techbyte.repository.ProdutoRepository;
import br.com.senai.techbyte.view.ProdutoConsoleView;

public class Main {
    static void main(){
        ProdutoRepository repository = new ProdutoMemoryRepository();

        ProdutoService service = new ProdutoService(repository);

        ProdutoController controller = new ProdutoController(service);

        ProdutoConsoleView view = new ProdutoConsoleView(controller);

        view.iniciar();
    }
}
