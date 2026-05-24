
        }

        System.out.println("\n=== STATISTIK ===");
        System.out.println("Total: " + total);
        System.out.println("Aktif: " + aktif);
        System.out.println("Dipinjam: " + dipinjam);
    }

    static void tampilHeader() {
        System.out.printf("%-5s %-15s %-15s %-10s %-12s %-10s\n",
                "ID", "Nama", "Kategori", "Jumlah", "Status", "Dipinjam");
        System.out.println("-------------------------------------------------------------