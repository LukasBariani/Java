try {
        menuConta.executarMenu();
} catch (InputMismatchException e) {
        System.out.println("Erro de entrada: valor inválido.");
} catch (MinhaExcecaoPersonalizada e) {
        System.out.println("Erro específico: " + e.getMessage());
        } catch (Exception e) {
        System.out.println("Erro inesperado: " + e.getMessage());
        }
