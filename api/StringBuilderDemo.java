public class StringBuilderDemo {
	public static void main(String[] args) {
	
		StringBuilder sb = new StringBuilder();

		sb.append("�߾�hta�п�")
		  .append("���԰��� �ȳ�")
		  .append("\n");
		sb.append("��������ǥ�������ӿ�ũ ����,")
		  .append("����Ʈ���� �������α׷� ������ ����")
		  .append("\n");
		sb.append("�����Ⱓ(��):");
		sb.append(120);

		String text = sb.toString();
		System.out.println(text);
	}
}