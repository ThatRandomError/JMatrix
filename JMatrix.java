import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class JMatrix {
    private ArrayList<ArrayList<Double>> matrix;

    public JMatrix(ArrayList<ArrayList<Double>> matrix) {
        this.matrix = matrix;
    }

    public JMatrix() {
        this.matrix = new ArrayList<ArrayList<Double>>();
    }

    public static JMatrix exp(JMatrix matrix) {
        ArrayList<ArrayList<Double>> list = matrix.getList();

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                list.get(i).set(j, Math.pow(Math.E , (list.get(i).get(j))));
            }
        }

        return new JMatrix(list);
    }

    public static JMatrix power(JMatrix matrix, double exponent) {
        ArrayList<ArrayList<Double>> result = new ArrayList<>();
        ArrayList<ArrayList<Double>> list = matrix.getList();

        for (ArrayList<Double> row : result) {
            ArrayList<Double> newRow = new ArrayList<>();
            for (Double element : row) {
                newRow.add(Math.pow(element, exponent));
            }
            result.add(newRow);
        }

        return new JMatrix(result);
    }

    public static double sum(JMatrix matrix) {
        ArrayList<ArrayList<Double>> list = matrix.getList();
        double total = 0.0;
        
        for (ArrayList<Double> row : list) {
            for (Double element : row) {
                total += element;
            }
        }
    
        return total;
    }

    public static JMatrix addBy(JMatrix matrix, double num) {
        ArrayList<ArrayList<Double>> list = matrix.getList();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                list.get(i).set(j, list.get(i).get(j) + num);
            }
        }

        return new JMatrix(list);
    }

    public static JMatrix subBy(JMatrix matrix, double num) {
        ArrayList<ArrayList<Double>> list = matrix.getList();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                list.get(i).set(j, list.get(i).get(j) - num);
            }
        }

        return new JMatrix(list);
    }

    public static JMatrix subByMatrix(JMatrix matrix, double num) {
        ArrayList<ArrayList<Double>> list = matrix.getList();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                list.get(i).set(j, num / list.get(i).get(j));
            }
        }
        return new JMatrix(list);
    }

    public static JMatrix divBy(JMatrix matrix, double num) {
        ArrayList<ArrayList<Double>> list = matrix.getList();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                list.get(i).set(j, list.get(i).get(j) / num);
            }
        }
        return new JMatrix(list);
    }

    public static JMatrix mulBy(JMatrix matrix, double num) {
        ArrayList<ArrayList<Double>> list = matrix.getList();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                list.get(i).set(j, list.get(i).get(j) * num);
            }
        }
        return new JMatrix(list);
    }


    public static JMatrix divByMatrix(JMatrix matrix, double num) {
        ArrayList<ArrayList<Double>> list = matrix.getList();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                list.get(i).set(j, num / list.get(i).get(j));
            }
        }

        return new JMatrix(list);
    }

    public static JMatrix mul(JMatrix matrix1, JMatrix matrix2) {
        ArrayList<ArrayList<Double>> list1 = matrix1.getList();
        ArrayList<ArrayList<Double>> list2 = matrix2.getList();
        
        if (list2.size() != list1.size()) {
            throw new IllegalArgumentException("Matrixs different rows size");
        }

        ArrayList<ArrayList<Double>> result = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            ArrayList<Double> row2 = list2.get(i);
            ArrayList<Double> row1 = list1.get(i);

            if (row2.size() != row1.size()) {
                throw new IllegalArgumentException("Matrixs different column size");
            }

            ArrayList<Double> rowResult = new ArrayList<>();
            for (int j = 0; j < row2.size(); j++) {
                rowResult.add(row2.get(j) * row1.get(j));
            }
            result.add(rowResult);
        }

        return new JMatrix(result);
    }

    public static JMatrix add(JMatrix matrix1, JMatrix matrix2) {
        ArrayList<ArrayList<Double>> list1 = matrix1.getList();
        ArrayList<ArrayList<Double>> list2 = matrix2.getList();
        
        if (list2.size() != list1.size()) {
            throw new IllegalArgumentException("Matrixs different rows size");
        }

        ArrayList<ArrayList<Double>> result = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            ArrayList<Double> row2 = list2.get(i);
            ArrayList<Double> row1 = list1.get(i);

            if (row2.size() != row1.size()) {
                throw new IllegalArgumentException("Matrixs different column size");
            }

            ArrayList<Double> rowResult = new ArrayList<>();
            for (int j = 0; j < row2.size(); j++) {
                rowResult.add(row2.get(j) + row1.get(j));
            }
            result.add(rowResult);
        }

        return new JMatrix(result);
    }

    public static JMatrix sub(JMatrix matrix1, JMatrix matrix2) {
        ArrayList<ArrayList<Double>> list1 = matrix1.getList();
        ArrayList<ArrayList<Double>> list2 = matrix2.getList();
        
        if (list2.size() != list1.size()) {
            throw new IllegalArgumentException("Matrixs different rows size");
        }

        ArrayList<ArrayList<Double>> result = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            ArrayList<Double> row2 = list2.get(i);
            ArrayList<Double> row1 = list1.get(i);

            if (row2.size() != row1.size()) {
                throw new IllegalArgumentException("Matrixs different column size");
            }

            ArrayList<Double> rowResult = new ArrayList<>();
            for (int j = 0; j < row2.size(); j++) {
                rowResult.add(row1.get(j) - row2.get(j));
            }
            result.add(rowResult);
        }

        return new JMatrix(result);
    }

    public static JMatrix dot(JMatrix matrix1, JMatrix matrix2) {
        ArrayList<ArrayList<Double>> list1 = matrix1.getList();
        ArrayList<ArrayList<Double>> list2 = matrix2.getList();
        
        if (list1.size() == 1 && list2.size() == 1) {
            ArrayList<ArrayList<Double>> result = outer(matrix1, matrix2).getList();
            return new JMatrix(result);
        }
    
        ArrayList<ArrayList<Double>> result = multiply2DMatrices(list1, list2);
        
        return new JMatrix(result);
    }
    
    public static JMatrix outer(JMatrix matrix1, JMatrix matrix2) {
        ArrayList<ArrayList<Double>> list1 = matrix1.getList();
        ArrayList<ArrayList<Double>> list2 = matrix2.getList();

        int sizeA = list1.get(0).size();
        int sizeB = list2.get(0).size();

        ArrayList<ArrayList<Double>> result = new ArrayList<>();
        for (int i = 0; i < sizeA; i++) {
            ArrayList<Double> row = new ArrayList<>();
            for (int j = 0; j < sizeB; j++) {
                row.add(list1.get(0).get(i) * list2.get(0).get(j));
            }
            result.add(row);
        }

        return new JMatrix(result);
    }

    private static ArrayList<ArrayList<Double>> multiply2DMatrices(ArrayList<ArrayList<Double>> list1, ArrayList<ArrayList<Double>> list2) {
        int rowsA = list1.size();
        int colsA = list1.get(0).size();
        int rowsB = list2.size();
        int colsB = list2.get(0).size();

        if (colsA != rowsB) {
            throw new IllegalArgumentException("Number of columns in Matrix A must equal number of rows in Matrix B");
        }

        ArrayList<ArrayList<Double>> result = new ArrayList<>();
        for (int i = 0; i < rowsA; i++) {
            ArrayList<Double> row = new ArrayList<>();
            for (int j = 0; j < colsB; j++) {
                row.add(0.0);
            }
            result.add(row);
        }

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                double sum = 0.0;
                for (int k = 0; k < colsA; k++) {
                    sum += list1.get(i).get(k) * list2.get(k).get(j);
                }
                result.get(i).set(j, sum);
            }
        }

        return result;
    }

    public ArrayList<ArrayList<Double>> getList() {
        return matrix;
    }

    public JMatrix getMatrix() {
        return new JMatrix(matrix);
    }

    public double get(int x, int y) {
        return matrix.get(x).get(y);
    }

    public int getHeight() {
        return matrix.size();
    }

    public int getWidth() {
        if (matrix.isEmpty()) {
            return 0;
        }
        return matrix.get(0).size();
    }

    public static JMatrix zeros(int rows, int cols) {
        ArrayList<ArrayList<Double>> matrix = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            ArrayList<Double> row = new ArrayList<>();
            for (int j = 0; j < cols; j++) {
                row.add(0.0);
            }
            matrix.add(row);
        }
        return new JMatrix(matrix);
    }

    public static JMatrix ones(int rows, int cols) {
        ArrayList<ArrayList<Double>> matrix = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            ArrayList<Double> row = new ArrayList<>();
            for (int j = 0; j < cols; j++) {
                row.add(1.0);
            }
            matrix.add(row);
        }
        return new JMatrix(matrix);
    }

    public static JMatrix random(int rows, int cols) {
        ArrayList<ArrayList<Double>> matrix = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < rows; i++) {
            ArrayList<Double> row = new ArrayList<>();
            for (int j = 0; j < cols; j++) {
                row.add(rand.nextGaussian());
            }
            matrix.add(row);
        }
        return new JMatrix(matrix);
    }

    public static JMatrix Transpose(JMatrix matrix) {
        ArrayList<ArrayList<Double>> list1 = matrix.getList();
        int rowCount = list1.size();
        int colCount = list1.get(0).size();
    
        ArrayList<ArrayList<Double>> list2 = new ArrayList<>();
    
        for (int i = 0; i < colCount; i++) {
            ArrayList<Double> row = new ArrayList<>();
            for (int j = 0; j < rowCount; j++) {
                row.add(0.0);
            }
            list2.add(row);
        }
    
        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                list2.get(j).set(i, list1.get(i).get(j));
            }
        }
    
        return new JMatrix(list2);
    }
    

    public static ArrayList<ArrayList<Double>> toJMatrix(ArrayList<Double> list) {
        ArrayList<ArrayList<Double>> matrix = new ArrayList<>();
        matrix.add(list);
        return matrix;
    }

    public static JMatrix convertArray(Double[][] array) {
        ArrayList<ArrayList<Double>> arrayList = new ArrayList<ArrayList<Double>>();
        for (Double[] row : array) {
            arrayList.add(new ArrayList<>(Arrays.asList(row)));
        }
        return new JMatrix(arrayList);
    }

}
