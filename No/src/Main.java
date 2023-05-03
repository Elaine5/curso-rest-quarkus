public class Main {
    public static void main(String[] args) {
        class No {
            private long id;
            private No lef, rig;

            public No(long id, No lef, No rig) {
                this.id = id;
                this.lef = lef;
                this.rig = rig;
            }

            public long getId() {
                return this.id;
            }

            public No getLef() {
                return lef;
            }

            public No getRig() {
                return rig;
            }
        }

        class ArvoreBinaria {
            private No raiz;

            public ArvoreBinaria() {
                this.raiz = null;
            }

            // outros métodos

            public int countLeftFestive() {
                return countLeftFestive(this.raiz);
            }

            private int countLeftFestive(No no) {
                if (no == null) {
                    return 0;
                }
                int count = countLeftFestive(no.getLef()) + countLeftFestive(no.getRig());
                if (no.getLef() != null) {
                    count++;
                }
                return count;
            }

            public void printIndent() {
                printIndent(this.raiz, 0);
            }

            private void printIndent(No no, int level) {
                if (no == null) {
                    return;
                }
                printIndent(no.getRig(), level + 1);
                for (int i = 0; i < level; i++) {
                    System.out.print("\t");
                }
                System.out.println(no.getId());
                printIndent(no.getLef(), level + 1);
            }
        }
     }
}