import javax.swing.*;
import java.awt.*;

public class GraficoParabola extends JPanel {
    private double a, b, c, x1, x2;

    // Construtor recebe os coeficientes e raízes
    public GraficoParabola(double a, double b, double c, double x1, double x2) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.x1 = x1;
        this.x2 = x2;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        int largura = getWidth();
        int altura = getHeight();

        // Definir centro do gráfico
        int centroX = largura / 2;
        int centroY = altura / 2;

        // Desenhar os eixos X e Y
        g2.setColor(Color.BLACK);
        g2.drawLine(0, centroY, largura, centroY); // Eixo X
        g2.drawLine(centroX, 0, centroX, altura);  // Eixo Y

        // Definir escala (ajustar para valores grandes)
        double escala = 40; // Quanto maior, menor será a parábola

        g2.setColor(Color.BLUE);

        // Desenhar a parábola ponto a ponto
        for (int px = -centroX; px < centroX; px++) {
            double xReal = px / escala;  // Converter coordenadas de pixels para valores reais
            double yReal = a * xReal * xReal + b * xReal + c; // Calcular f(x)
            int py = (int) (-yReal * escala); // Inverter para ajustar a coordenada Y

            g2.fillOval(centroX + px, centroY + py, 2, 2); // Desenhar o ponto
        }


    }

    // Criar um JFrame para exibir o gráfico
    public static void exibirGrafico(double a, double b, double c, double x1, double x2) {
        JFrame frame = new JFrame("Gráfico da Equação");
        frame.setSize(600, 600);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.add(new GraficoParabola(a, b, c, x1, x2));
        frame.setVisible(true);
    }
}
