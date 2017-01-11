public class DisplayChartApp {
	public static void main(String[] args) {
		
		// Chart ���� ��ü �����
		Chart c1 = new XLSChart();
		Chart c2 = new CloudChart();

		// Chart�� ��ü�� �����ؼ� Display��ü �����
		Display chartDisplay1 = new Display(c1);
		Display chartDisplay2 = new Display(c2);

		// �׷��� �׸���
		chartDisplay1.drawGraph();
		chartDisplay2.drawGraph();
		
	}
}