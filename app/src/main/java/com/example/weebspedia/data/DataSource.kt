package com.example.weebspedia.data

import com.example.weebspedia.model.AnimeData
import com.example.weebspedia.model.Article
import com.example.weebspedia.model.Genre

object DataSource{
    fun animeList(): List<AnimeData> = listOf(
        AnimeData(
            id = 1,
            title = "Kusuriya no Hitorigoto",
            description = "Maomao, putri seorang apoteker, telah direnggut dari kehidupannya yang damai dan dijual ke eselon terendah di istana kekaisaran. Sekarang hanya seorang pelayan, Maomao menyesuaikan diri dengan kehidupan barunya yang biasa dan menyembunyikan pengetahuannya yang luas tentang pengobatan untuk menghindari perhatian yang tidak diinginkan.\n" +
                    "\n" +
                    "Tidak lama setelah kedatangan Maomao, anak-anak kaisar yang masih bayi secara misterius mulai mengalami gejala-gejala yang mengerikan - hampir seperti sebuah kutukan. Maomao yang penasaran dengan mudah memecahkan misteri tersebut dan, agar tidak menjadi pusat perhatian, ia mencoba untuk meninggalkan petunjuk anonim. Sayangnya, kasim Jinshi yang gagah dan tanggap mengetahuinya dan berhasil menemukannya.\n" +
                    "\n" +
                    "Sebagai pengakuan atas bakatnya, Maomao dipromosikan menjadi dayang untuk selir kesayangan kaisar, Gyokuyou. Saat Maomao terus mengobati berbagai penyakit yang menimpa istana kekaisaran, keahliannya di bidang farmasi dengan cepat terbukti sangat diperlukan.\n",
            imageUrl = "https://cdn.myanimelist.net/images/anime/1674/137009.jpg",
            rating = 8.92,
            date = "January 2024",
            statusEnd = true,
            eps = 24,
            genreId = listOf(
                1, 2
            )
        ),
        AnimeData(
            id = 2,
            title = "Sousou no Frieren",
            description = "Selama satu dekade pencarian mereka untuk mengalahkan Raja Iblis, para anggota kelompok pahlawan-Himmel sendiri, pendeta Heiter, prajurit kurcaci Eisen, dan penyihir peri Frieren-menjalin ikatan melalui petualangan dan pertempuran, menciptakan kenangan berharga yang tak terlupakan bagi sebagian besar dari mereka.\n" +
                    "\n" +
                    "Namun, waktu yang dihabiskan Frieren bersama rekan-rekannya hanya setara dengan sebagian kecil dari hidupnya yang telah berlangsung selama lebih dari seribu tahun. Ketika pesta bubar setelah kemenangan mereka, Frieren dengan santai kembali ke rutinitas “biasanya” untuk mengumpulkan mantra di seluruh benua. Karena rasa waktu yang berbeda, dia tampaknya tidak memiliki perasaan yang kuat terhadap pengalaman yang telah dilaluinya.\n" +
                    "\n" +
                    "Seiring berlalunya waktu, Frieren perlahan-lahan menyadari bagaimana hari-harinya di pesta pahlawan benar-benar berdampak pada dirinya. Menyaksikan kematian dua mantan rekannya, Frieren mulai menyesal karena telah menganggap remeh kehadiran mereka; dia bersumpah untuk lebih memahami manusia dan menciptakan hubungan pribadi yang nyata. Meskipun kisah perjalanan yang sangat berkesan itu telah lama berakhir, kisah baru akan segera dimulai.\n",
            imageUrl = "https://cdn.myanimelist.net/images/anime/1015/138006.jpg",
            rating = 9.37,
            date = "January 2024",
            statusEnd = true,
            eps = 28,
            genreId = listOf(
                1, 3, 4
            )
        ),
        AnimeData(
            id = 3,
            title = "Boku dake ga Inai Machi",
            description = "Ketika tragedi akan terjadi, Satoru Fujinuma mendapati dirinya dikirim kembali beberapa menit sebelum kecelakaan terjadi. Seniman manga berusia 29 tahun yang terpisah dari dunia nyata ini telah memanfaatkan fenomena yang kuat namun misterius ini, yang ia sebut “Kebangkitan”, untuk menyelamatkan banyak nyawa.\n" +
                    "\n" +
                    "Namun, ketika dia dituduh membunuh seseorang yang dekat dengannya, Satoru dikirim kembali ke masa lalu sekali lagi, tapi kali ini ke tahun 1988, 18 tahun yang lalu. Segera, dia menyadari bahwa pembunuhan itu mungkin terkait dengan penculikan dan pembunuhan salah satu teman sekelasnya, Kayo Hinazuki yang penyendiri dan misterius, yang terjadi ketika dia masih kecil. Ini adalah kesempatannya untuk memperbaiki keadaan.\n" +
                    "\n" +
                    "Boku dake ga Inai Machi mengikuti Satoru dalam misinya untuk mengungkap apa yang sebenarnya terjadi 18 tahun yang lalu dan mencegah kematian teman sekelasnya sambil melindungi orang-orang yang dia sayangi di masa sekarang.",
            imageUrl = "https://cdn.myanimelist.net/images/anime/10/77957.jpg",
            rating = 8.30,
            date = "January 2016",
            statusEnd = true,
            eps = 12,
            genreId = listOf(
                2,5,6
            )
        ),
        AnimeData(
            id = 4,
            title = "Angel Beats!",
            description = "Kematian adalah salah satu dari sekian banyak misteri yang membuat manusia berada dalam kegelapan sejak awal waktu. Namun, pertanyaan besar tentang apa yang terjadi pada jiwa setelah seseorang meninggal segera terjawab bagi Yuzuru Otonashi yang berusia 17 tahun. Terbangun tanpa ingatan sebelumnya di sebuah dimensi antara hidup dan mati, dia menemukan kebenaran yang meresahkan tentang kehidupan setelah kematian.\n" +
                    "\n" +
                    "Mengambil bentuk sebuah sekolah menengah, dimensi aneh ini ditujukan untuk menampung mereka yang meninggal secara tidak wajar. Merasa dirugikan oleh Tuhan selama kehidupan duniawi mereka, para penghuni sekolah telah memutuskan untuk membentuk Afterlife Battlefront-sebuah faksi pemberontak yang bertekad untuk menentang ketua OSIS mereka yang seperti dewa, Kanade “Angel” Tachibana. Pemimpin kelompok ini, Yuri Nakamura, merekrut Otonashi untuk melawan Angel demi mengambil alih kendali atas kehidupan mereka sendiri. Namun, mempertanyakan moralitas di balik tindakan mereka, Otonashi mengambil langkah di belakang garis musuh untuk memahami sisi berlawanan dari nasib bersama mereka.",
            imageUrl = "https://cdn.myanimelist.net/images/anime/1801/111298l.jpg",
            rating = 8.06,
            date = "April 2010",
            statusEnd = true,
            eps = 12,
            genreId = listOf(
                1, 5
            )
        ),
        AnimeData(
            id = 5,
            title = "Kimetsu no Yaiba",
            description = "Sejak kematian ayahnya, beban untuk menghidupi keluarga berada di pundak Tanjirou Kamado. Meskipun hidup miskin di gunung terpencil, keluarga Kamado dapat menikmati kehidupan yang relatif damai dan bahagia. Suatu hari, Tanjirou memutuskan untuk turun ke desa setempat untuk mencari sedikit uang dengan menjual arang. Dalam perjalanan pulang, malam tiba, memaksa Tanjirou untuk berlindung di rumah seorang pria asing, yang memperingatkannya tentang keberadaan setan pemakan daging yang mengintai di hutan pada malam hari.\n" +
                    "\n" +
                    "Ketika dia akhirnya tiba di rumah keesokan harinya, dia bertemu dengan pemandangan yang mengerikan - seluruh keluarganya telah dibantai. Lebih buruk lagi, satu-satunya yang selamat adalah saudara perempuannya, Nezuko, yang telah berubah menjadi iblis yang haus darah. Dikuasai oleh kemarahan dan kebencian, Tanjirou bersumpah untuk membalaskan dendam keluarganya dan tetap berada di sisi satu-satunya saudaranya yang tersisa. Bersama kelompok misterius yang menamakan diri mereka Korps Pembasmi Iblis, Tanjirou akan melakukan apa pun untuk membunuh iblis dan melindungi sisa-sisa kemanusiaan adik tercintanya.",
            imageUrl = "https://cdn.myanimelist.net/images/anime/1286/99889.jpg",
            rating = 8.47,
            date = "April 2019",
            statusEnd = true,
            eps = 26,
            genreId = listOf(
                3, 7
            )
        ),
        AnimeData(
            id = 6,
            title = "Jujutsu Kaisen",
            description = "Memanjakan diri dalam kegiatan paranormal yang tidak masuk akal dengan Klub Gaib, Yuuji Itadori, seorang siswa sekolah menengah, menghabiskan hari-harinya di ruang klub atau rumah sakit, di mana dia mengunjungi kakeknya yang terbaring di tempat tidur. Namun, gaya hidup yang santai ini segera berubah menjadi aneh ketika dia tanpa sadar menemukan sebuah benda terkutuk. Memicu serangkaian kejadian supernatural, Yuuji mendapati dirinya tiba-tiba terdorong ke dunia Kutukan-makhluk mengerikan yang terbentuk dari kebencian dan kenegatifan manusia-setelah menelan benda tersebut, yang ternyata adalah jari milik iblis Sukuna Ryoumen, Raja Kutukan.\n" +
                    "\n" +
                    "Yuuji mengalami sendiri ancaman yang ditimbulkan oleh Kutukan ini terhadap masyarakat saat ia menemukan kekuatan barunya. Diperkenalkan ke Sekolah Menengah Jujutsu Prefektur Tokyo, dia mulai berjalan menyusuri jalan yang tidak bisa dia kembalikan - jalan penyihir Jujutsu.",
            imageUrl = "https://cdn.myanimelist.net/images/anime/1568/128066.jpg",
            rating = 8.60,
            date = "Oktober 2020",
            statusEnd = true,
            eps = 24,
            genreId = listOf(
                3, 7
            )
        ),
        AnimeData(
            id = 7,
            title = "No Game No Life",
            description = "Enam belas ras makhluk hidup mendiami Disboard, sebuah dunia yang diawasi oleh Tet, Tuhan Yang Maha Esa. Ras terendah dari keenam belas ras tersebut-Imanity-terdiri dari manusia, ras yang tidak memiliki ketertarikan terhadap sihir. Di tempat di mana segala sesuatunya diputuskan melalui permainan sederhana, umat manusia tampaknya tidak memiliki jalan keluar dari kesulitan mereka-tetapi kedatangan dua orang luar menimbulkan perubahan.\n" +
                    "\n" +
                    "Di Bumi, saudara tiri Sora dan Shiro adalah dua orang yang tak terpisahkan yang mendominasi berbagai game online dengan nama pengguna “Blank”. Meskipun terkenal di internet, keduanya percaya bahwa hidup hanyalah sebuah permainan yang membosankan. Namun, setelah menanggapi sebuah pesan dari pengguna yang tidak dikenal, mereka tiba-tiba dibawa ke Disboard. Pengirim misterius itu ternyata adalah Tet, yang memberi tahu mereka tentang aturan absolut dunia. Setelah Tet pergi, Sora dan Shiro mulai mencari informasi lebih lanjut dan tempat tinggal, yang membawa mereka ke satu-satunya kerajaan Elkia-Imanity yang tersisa.\n" +
                    "\n" +
                    "Di sana, keduanya bertemu dengan Stephanie Dola, seorang gadis emosional yang memperjuangkan kedaulatan kerajaan. Dalam keputusasaan, dia berusaha untuk mendapatkan kembali tahta ayahnya, tetapi kebodohannya membuat tujuannya tidak tercapai. Terinspirasi oleh motivasi dan semangat gadis itu, Sora dan Shiro memutuskan untuk membantu Stephanie dalam membangun kembali Elkia, yang pada akhirnya bertujuan untuk menjadi penguasa baru di dunia yang penuh teka-teki ini.",
            imageUrl = "https://cdn.myanimelist.net/images/anime/12/59115.jpg",
            rating = 8.06,
            date = "April 2009",
            statusEnd = true,
            eps = 12,
            genreId = listOf(
                3, 8, 9
            )
        ),
        AnimeData(
            id = 8,
            title = "Koe no Katachi",
            description = "Sebagai anak muda yang liar, siswa sekolah dasar, Shouya Ishida berusaha mengalahkan kebosanan dengan cara yang paling kejam. Ketika Shouko Nishimiya yang tuli pindah ke kelasnya, Shouya dan teman-teman sekelasnya tanpa berpikir panjang menggertaknya untuk bersenang-senang. Namun, ketika ibunya memberi tahu pihak sekolah, dia dikucilkan dan disalahkan atas semua yang terjadi padanya. Dengan pindahnya Shouko dari sekolah, Shouya menjadi bergantung pada belas kasihan teman-teman sekelasnya. Dia dikucilkan tanpa belas kasihan di seluruh sekolah dasar dan menengah, sementara para guru menutup mata.\n" +
                    "\n" +
                    "Sekarang di tahun ketiga di sekolah menengah atas, Shouya masih terbebani oleh kesalahannya sebagai seorang anak laki-laki. Dengan tulus menyesali perbuatannya di masa lalu, dia memulai perjalanan penebusan: untuk bertemu Shouko sekali lagi dan menebus kesalahannya.\n" +
                    "\n" +
                    "Koe no Katachi menceritakan kisah mengharukan tentang pertemuan kembali Shouya dengan Shouko dan usahanya yang jujur untuk menebus kesalahannya, sambil terus dihantui oleh bayang-bayang masa lalunya.",
            imageUrl = "https://cdn.myanimelist.net/images/anime/1347/134168.jpg",
            rating = 8.93,
            date = "September 2016",
            statusEnd = true,
            eps = 1,
            genreId = listOf(
                1
            )
        ),
        AnimeData(
            id = 9,
            title = "Shigatsu wa Kimi no Uso",
            description = "Kousei Arima adalah seorang anak ajaib yang dikenal sebagai “Metronom Manusia” karena memainkan piano dengan presisi dan sempurna. Dibimbing oleh ibunya yang tegas dan latihan yang keras, Kousei mendominasi setiap kompetisi yang diikutinya, mendapatkan kekaguman dari rekan-rekan musisi dan pujian dari para penonton. Ketika ibunya tiba-tiba meninggal dunia, trauma yang dialaminya membuatnya tidak dapat mendengar suara piano, dan dia tidak pernah naik ke atas panggung lagi.\n" +
                    "\n" +
                    "Saat ini, Kousei menjalani kehidupan yang tenang dan sederhana sebagai siswa SMP bersama teman-temannya, Tsubaki Sawabe dan Ryouta Watari. Sambil berjuang untuk melupakan kematian ibunya, ia terus berpegang teguh pada musik. Kehidupannya yang monokrom berubah menjadi terbalik saat ia bertemu dengan pemain biola eksentrik Kaori Miyazono, yang mendorongnya kembali menjadi sorotan sebagai pengiringnya. Melalui sebuah kebohongan kecil, kedua musisi muda ini menjadi semakin dekat saat Kaori mencoba mengisi dunia Kousei dengan warna.",
            imageUrl = "https://cdn.myanimelist.net/images/anime/5/69957.jpg",
            rating = 8.64,
            date = "Oktober 2014",
            statusEnd = true,
            eps = 22,
            genreId = listOf(
                1, 10
            )
        ),
        AnimeData(
            id = 10,
            title = "Noragami",
            description = "Pada saat dibutuhkan, jika Anda mencari di tempat yang tepat, Anda mungkin akan melihat nomor telepon aneh yang dicoret dengan warna merah. Jika Anda menelepon nomor ini, Anda akan mendengar seorang pemuda memperkenalkan dirinya sebagai Dewa Yato.\n" +
                    "\n" +
                    "Yato adalah dewa kecil dan memproklamirkan diri sebagai “Dewa Pembawa Rezeki”, yang bermimpi memiliki jutaan pemuja. Namun, tanpa satu pun kuil yang didedikasikan untuk namanya, cita-citanya masih jauh dari kenyataan. Dia menghabiskan hari-harinya dengan bekerja serabutan dengan bayaran lima yen per hari, hingga akhirnya rekan senjatanya muak dengan tuannya yang tidak berguna dan meninggalkannya.\n" +
                    "\n" +
                    "Ketika segala sesuatunya tampak suram bagi sang dewa, keberuntungannya berubah ketika seorang gadis sekolah menengah, Hiyori Iki, konon menyelamatkan Yato dari kecelakaan mobil, dan menabraknya. Hebatnya, dia selamat, tetapi peristiwa itu menyebabkan jiwanya lepas dan kemudian dapat meninggalkan tubuhnya. Hiyori menuntut Yato untuk mengembalikannya ke keadaan normal, namun setelah mengetahui bahwa dia membutuhkan pasangan baru untuk melakukannya, dengan enggan setuju untuk membantunya menemukannya. Dan dengan bantuan Hiyori, keberuntungan Yato akhirnya bisa berbalik.",
            imageUrl = "https://cdn.myanimelist.net/images/anime/5/69957.jpg",
            rating = 7.95,
            date = "January 2014",
            statusEnd = true,
            eps = 12,
            genreId = listOf(
                3, 7
            )
        ),
        AnimeData(
            id = 11,
            title = "Hunter x Hunter (2011)",
            description = "Para Hunter mengabdikan diri mereka untuk menyelesaikan tugas-tugas berbahaya, mulai dari melintasi wilayah yang belum dipetakan di dunia hingga menemukan item dan monster langka. Sebelum menjadi Hunter, seseorang harus lulus Ujian Hunter-proses seleksi berisiko tinggi di mana sebagian besar pelamar berakhir dengan cacat atau lebih buruk lagi, meninggal dunia.\n" +
                    "\n" +
                    "Peserta ambisius yang menantang ujian yang terkenal kejam ini memiliki alasan tersendiri. Yang mendorong Gon Freecss yang berusia 12 tahun adalah menemukan Ging, ayahnya dan juga seorang Hunter. Percaya bahwa ia akan bertemu dengan ayahnya dengan menjadi seorang Hunter, Gon mengambil langkah pertama untuk berjalan di jalur yang sama.\n" +
                    "\n" +
                    "Selama Ujian Hunter, Gon berteman dengan mahasiswa kedokteran Leorio Paladiknight, Kurapika yang pendendam, dan mantan pembunuh Killua Zoldyck. Meskipun motif mereka sangat berbeda satu sama lain, mereka bersatu demi tujuan yang sama dan mulai menjelajah ke dunia yang berbahaya.\n" +
                    "\n" +
                    "Translated with DeepL.com (free version)",
            imageUrl = "https://cdn.myanimelist.net/images/anime/1337/99013.jpg",
            rating = 9.04,
            date = "Oktober 2011",
            statusEnd = true,
            eps = 148,
            genreId = listOf(
                3, 4, 7
            )
        ),
        AnimeData(
            id = 12,
            title = "One Punch Man",
            description = "Saitama yang tampak tidak mengesankan memiliki hobi yang cukup unik: menjadi pahlawan. Demi mengejar impian masa kecilnya, Saitama berlatih tanpa henti selama tiga tahun, dan kehilangan semua rambutnya dalam prosesnya. Sekarang, Saitama sangat kuat, dia bisa mengalahkan musuh mana pun hanya dengan satu pukulan. Namun, karena tidak ada yang mampu menandingi kekuatannya, Saitama mengalami masalah yang tak terduga-dia tidak lagi dapat menikmati sensasi bertarung dan menjadi sangat bosan.\n" +
                    "\n" +
                    "Suatu hari, Saitama menarik perhatian cyborg berusia 19 tahun, Genos, yang menyaksikan kekuatannya dan ingin menjadi murid Saitama. Genos mengusulkan agar keduanya bergabung dengan Asosiasi Pahlawan untuk menjadi pahlawan bersertifikat yang akan diakui atas kontribusi positif mereka kepada masyarakat. Saitama, yang terkejut karena tidak ada yang tahu siapa dirinya, dengan cepat menyetujuinya. Bertemu dengan sekutu baru dan menghadapi musuh baru, Saitama memulai perjalanan baru sebagai anggota Asosiasi Pahlawan untuk merasakan keseruan pertempuran yang pernah ia rasakan.\n" +
                    "\n" +
                    "Translated with DeepL.com (free version)",
            imageUrl = "https://cdn.myanimelist.net/images/anime/12/76049.jpg",
            rating = 8.50,
            date = "Oktober 2015",
            statusEnd = true,
            eps = 12,
            genreId = listOf(
                7, 8
            )
        ),
        AnimeData(
            id = 13,
            title = "Steins;Gate",
            description = "Ilmuwan eksentrik Rintarou Okabe memiliki rasa haus yang tidak pernah berhenti akan eksplorasi ilmiah. Bersama dengan temannya yang cerewet namun bermaksud baik, Mayuri Shiina, dan teman sekamarnya, Itaru Hashida, Okabe mendirikan Laboratorium Gadget Masa Depan dengan harapan dapat menciptakan inovasi teknologi yang membingungkan jiwa manusia. Terlepas dari klaim kehebatannya, satu-satunya “gadget” penting yang telah diciptakan oleh ketiganya adalah microwave yang memiliki kekuatan membingungkan untuk mengubah pisang menjadi goo hijau.\n" +
                    "\n" +
                    "Namun, ketika Okabe menghadiri sebuah konferensi tentang perjalanan waktu, dia mengalami serangkaian kejadian aneh yang membuatnya percaya bahwa ada lebih banyak hal yang bisa dilakukan oleh gadget “Telepon Microwave” daripada yang terlihat. Tampaknya dapat mengirim pesan teks ke masa lalu menggunakan microwave, Okabe mencoba-coba lebih jauh dengan “mesin waktu,” menarik kemarahan dan perhatian organisasi misterius SERN.\n" +
                    "\n" +
                    "Karena penemuan baru ini, Okabe dan teman-temannya mendapati diri mereka dalam bahaya yang selalu ada. Saat dia bekerja untuk mengurangi kerusakan yang disebabkan oleh penemuannya pada garis waktu, Okabe bertempur tidak hanya untuk menyelamatkan orang-orang yang dicintainya tetapi juga untuk mempertahankan kewarasannya yang menurun.\n" +
                    "\n" +
                    "Translated with DeepL.com (free version)",
            imageUrl = "https://cdn.myanimelist.net/images/anime/1935/127974.jpg",
            rating = 9.07,
            date = "April 2011",
            statusEnd = true,
            eps = 24,
            genreId = listOf(
                1, 6, 11
            )
        ),
        AnimeData(
            id = 14,
            title = "Gintama°",
            description = "Gintoki, Shinpachi, dan Kagura kembali sebagai anggota tim Yorozuya yang suka bersenang-senang tetapi bangkrut! Hidup di dunia lain Edo, di mana pedang dilarang dan penguasa asing telah menaklukkan Jepang, mereka mencoba untuk bertahan hidup dengan melakukan pekerjaan apa pun yang bisa mereka lakukan. Namun, Shinpachi dan Kagura masih belum dibayar... Apakah Gin-chan benar-benar menghabiskan semua uangnya untuk bermain pachinko?\n" +
                    "\n" +
                    "Sementara itu, ketika Gintoki dalam keadaan mabuk berjalan sempoyongan pulang ke rumah pada suatu malam, sebuah pesawat luar angkasa asing jatuh di dekatnya. Seorang anggota kru yang terluka parah muncul dari kapal dan memberi Gintoki sebuah alat aneh berbentuk jam, memperingatkannya bahwa alat itu sangat kuat dan harus dijaga. Mengira itu adalah jam wekernya, Gintoki kemudian menghancurkan alat tersebut keesokan paginya dan tiba-tiba menemukan bahwa dunia di luar apartemennya terhenti. Dengan Kagura dan Shinpachi di sisinya, dia berangkat untuk memperbaiki perangkat tersebut; meskipun, seperti biasa, tidak ada yang sesederhana itu bagi tim Yorozuya.",
            imageUrl = "https://cdn.myanimelist.net/images/anime/3/72078.jpg",
            rating = 9.06,
            date = "April 2015",
            statusEnd = true,
            eps = 51,
            genreId = listOf(
                7, 8, 11
            )
        ),
        AnimeData(
            id = 15,
            title = "Kaguya-sama wa Kokurasetai: Ultra Romantic",
            description = "Anggota elit dari dewan mahasiswa Akademi Shuchiin melanjutkan kejenakaan kompetitif mereka sehari-hari. Ketua OSIS Miyuki Shirogane setiap hari berseteru dengan wakil ketua Kaguya Shinomiya, masing-masing berjuang mati-matian untuk mengelabui satu sama lain agar mau mengakui cinta mereka. Kaguya berjuang dalam batas-batas ketat keluarganya yang kaya dan tegang, memberontak terhadap sikapnya yang dingin dan kaku saat dia menghangatkan diri dengan Shirogane dan teman-temannya yang lain.\n" +
                    "\n" +
                    "Sementara itu, bendahara dewan Yuu Ishigami menderita di bawah beban naksirnya yang putus asa pada Tsubame Koyasu, seorang siswa kelas atas yang populer yang membantu menanamkan kepercayaan diri yang baru dalam dirinya. Miko Iino, anggota OSIS terbaru, semakin dekat dengan Ishigami yang melanggar peraturan sambil berusaha untuk mengatasi kode moralnya sendiri yang otoriter.\n" +
                    "\n" +
                    "Ketika cinta semakin berkembang di Akademi Shuchiin, para anggota OSIS menyeret teman-teman luar mereka ke dalam konflik yang semakin lucu.",
            imageUrl = "https://cdn.myanimelist.net/images/anime/1160/122627.jpg",
            rating = 9.01,
            date = "April 2022",
            statusEnd = true,
            eps = 13,
            genreId = listOf(
                8, 10
            )
        ),
    )

    fun genreList(): List<Genre> = listOf(
        Genre(
            1,
            "Drama"
        ),
        Genre(
            2,
            "Misteri"
        ),
        Genre(
            3,
            "Fantasi"
        ),
        Genre(
            4,
            "Adventure"
        ),
        Genre(
            5,
            "Supernatural"
        ),
        Genre(
            6,
            "Suspense"
        ),
        Genre(
            7,
            "Action"
        ),
        Genre(
            8,
            "Comedy"
        ),
        Genre(
            9,
            "Ecchi"
        ),
        Genre(
            10,
            "Romance"
        ),
        Genre(
            11,
            "Sci-fi"
        ),
    )

    fun articleList(): List<Article> = listOf(
        Article(
            id = 1,
            title = "Adachi and Shimamura Novels Will Not End in 12th Volume",
            description = "Hitoma Iruma mengungkapkan dalam postingan update bulan April di situs web Kakuyomu bahwa seri novel yuri Adachi dan Shimamura (Adachi to Shimamura) tidak akan berakhir di volume 12 seperti yang telah direncanakan sebelumnya.",
            imageUrl = "https://cdn.animenewsnetwork.com/thumbnails/max300x600/cms/news.7/210522/81thidyzszl._sl1500_.jpg",
            articleUrl = "https://www.animenewsnetwork.com/news/2024-05-06/adachi-and-shimamura-novels-will-not-end-in-12th-volume/.210522"
        ),
        Article(
            id = 2,
            title = "Illustrator Acky Bright, Macross Creator Shōji Kawamori, More Attend Anime Expo",
            description = "Staf Anime Expo mulai mengumumkan lebih banyak tamu dari Jepang pada tanggal 1 Mei untuk konvensi tahun ini. Konvensi ini akan menghadirkan pencipta dan ilustrator manga Acky Bright, serta sutradara dan perancang mekanik Shōji Kawamori. MangaGamer akan menghadirkan pengisi suara Sayaka Ōhara dan penulis skenario Ryukishi07 (Higurashi: When They Cry, waralaba Umineko When They Cry) ke konvensi.",
            imageUrl = "https://cdn.animenewsnetwork.com/thumbnails/max300x600/cms/news.7/210534/axshoji.jpg",
            articleUrl = "https://www.animenewsnetwork.com/news/2024-05-06/illustrator-acky-bright-macross-creator-shoji-kawamori-more-attend-anime-expo/.210534"
        ),
        Article(
            id = 3,
            title = "I Was Reincarnated as the 7th Prince Anime Reveals Additional Cast in New Trailer, New Visual",
            description = "Staf untuk anime televisi dari serial novel ringan Kenkyo na Circle berjudul I Was Reincarnated as the 7th Prince So I Can Take My Time Perfecting My Magical Ability (Tensei Shitara Dainana Ōji Datta no de, Kimamani Majutsu o Kiwamemasu) telah mengumumkan para pemeran Assassins' Guild dalam sebuah cuplikan baru pada hari Selasa, bersama dengan visual kunci baru untuk penonton di luar Jepang.",
            imageUrl = "https://cdn.animenewsnetwork.com/thumbnails/max600x600/cms/news.7/210498/princekaigai.jpg",
            articleUrl = "https://www.animenewsnetwork.com/news/2024-05-06/i-was-reincarnated-as-the-7th-prince-anime-reveals-additional-cast-in-new-trailer-new-visual/.210498"
        ),
        Article(
            id = 4,
            title = "Baki Hanma vs. Kengan Ashura Crossover Anime's Trailer Reveals Staff, Theme Songs, Crossover Fights",
            description = "Netflix meluncurkan sebuah trailer baru untuk anime kolaborasi crossover Baki Hanma vs Kengan Ashura pada hari Senin. Trailer tersebut mengungkapkan para staf, dan menampilkan lagu tema pembuka anime “Fly High” oleh Atarashii Gakkō!, lagu tema penutup “Don't Stay” oleh Lead, dan juga mengungkapkan pertarungan crossover lainnya dalam anime tersebut.",
            imageUrl = "https://cdn.animenewsnetwork.com/thumbnails/max700x700/cms/news.7/210528/bakikengan.jpg",
            articleUrl = "https://www.animenewsnetwork.com/news/2024-05-05/baki-hanma-vs-kengan-ashura-crossover-anime-trailer-reveals-staff-theme-songs-crossover-fights/.210528"
        ),
        Article(
            id = 5,
            title = "Senpai wa Otokonoko Anime Unveils Theme Song Artist, More Staff, July 4 Debut",
            description = "The staff of the television anime of Pom's Senpai wa Otokonoko (This is Him or literally, Senpai is a Boy) web manga revealed the anime's second key visual, opening and ending theme songs' artist, more staff members, and July 4 premiere on Sunday.",
            imageUrl = "https://cdn.animenewsnetwork.com/thumbnails/max600x600/cms/news.7/210512/senpai.png.jpg",
            articleUrl = "https://www.animenewsnetwork.com/news/2024-05-05/senpai-wa-otokonoko-anime-unveils-theme-song-artist-more-staff-july-4-debut/.210512"
        ),
    )
}