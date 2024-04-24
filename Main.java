
class Main {
	
	public static void main(String[] args) {
		double[][] A1 = { { 1.0, 2.0, 3.0 }, { 4.0, 5.0, 6.0 } };
		double[][] A2 = { { 7.0, 8.0, 9.0 }, { 10.0, 11.0, 12.0 } };

		Mat mat = new Mat();
		System.out.println("行列A1");
		mat.show(A1);
		System.out.println("行列A2");
		mat.show(A2);

		System.out.println("A1のスカラー倍");
		mat.show(mat.sc(A1, 10));
		System.out.println("A2のスカラー倍");
		mat.show(mat.sc(A2, 10));

		System.out.println("A1の転置行列");
		mat.show(mat.T(A1));
		System.out.println("A2の転置行列");
		mat.show(mat.T(A2));

		System.out.println("A1とA2の和");
		mat.show(mat.add(A1, A2));
		System.out.println("A1とA2の差");
		mat.show(mat.sub(A1, A2));
		System.out.println("A1とA2の要素ごとの積");
		mat.show(mat.mul(A1, A2));
		System.out.println("A1とA2の要素ごとの除算");
		mat.show(mat.div(A1, A2));

		System.out.println("「A1」と「A2の転置行列」の行列積");
		mat.show(mat.matmul(A1, mat.T(A2)));
	}
}
