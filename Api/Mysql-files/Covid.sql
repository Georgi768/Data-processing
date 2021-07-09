-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 10, 2021 at 12:45 AM
-- Server version: 10.4.6-MariaDB
-- PHP Version: 7.3.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `restfullapi`
--

-- --------------------------------------------------------

--
-- Table structure for table `covid19`
--

CREATE TABLE `covid19` (
  `Id` int(11) NOT NULL,
  `Country` varchar(50) NOT NULL,
  `Confirmed` int(11) NOT NULL,
  `Deaths` int(11) NOT NULL,
  `Recovered` int(11) NOT NULL,
  `Active` int(11) NOT NULL,
  `New_cases` int(11) NOT NULL,
  `New_deaths` int(11) NOT NULL,
  `New_recovered` int(11) NOT NULL,
  `Deaths_100_Cases` double NOT NULL,
  `Recovered_100_Cases` double NOT NULL,
  `deaths_100_recovered` double DEFAULT NULL,
  `Confirmed_last_week` int(11) NOT NULL,
  `one_week_change` int(11) NOT NULL,
  `one_week_increase` double NOT NULL,
  `WHORegion` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `covid19`
--

INSERT INTO `covid19` (`Id`, `Country`, `Confirmed`, `Deaths`, `Recovered`, `Active`, `New_cases`, `New_deaths`, `New_recovered`, `Deaths_100_Cases`, `Recovered_100_Cases`, `deaths_100_recovered`, `Confirmed_last_week`, `one_week_change`, `one_week_increase`, `WHORegion`) VALUES
(437, 'Afghanistan', 36263, 1269, 25198, 9796, 106, 10, 18, 3.5, 69.49, 5.04, 35526, 737, 2.07, 'Eastern Mediterranean'),
(438, 'Albania', 4880, 144, 2745, 1991, 117, 6, 63, 2.95, 56.25, 5.25, 4171, 709, 17, 'Europe'),
(439, 'Algeria', 27973, 1163, 18837, 7973, 616, 8, 749, 4.16, 67.34, 6.17, 23691, 4282, 18.07, 'Africa'),
(440, 'Andorra', 907, 52, 803, 52, 10, 0, 0, 5.73, 88.53, 6.48, 884, 23, 2.6, 'Europe'),
(441, 'Angola', 950, 41, 242, 667, 18, 1, 0, 4.32, 25.47, 16.94, 749, 201, 26.84, 'Africa'),
(442, 'Antigua and Barbuda', 86, 3, 65, 18, 4, 0, 5, 3.49, 75.58, 4.62, 76, 10, 13.16, 'Americas'),
(443, 'Argentina', 167416, 3059, 72575, 91782, 4890, 120, 2057, 1.83, 43.35, 4.21, 130774, 36642, 28.02, 'Americas'),
(444, 'Armenia', 37390, 711, 26665, 10014, 73, 6, 187, 1.9, 71.32, 2.67, 34981, 2409, 6.89, 'Europe'),
(445, 'Australia', 15303, 167, 9311, 5825, 368, 6, 137, 1.09, 60.84, 1.79, 12428, 2875, 23.13, 'Western Pacific'),
(446, 'Austria', 20558, 713, 18246, 1599, 86, 1, 37, 3.47, 88.75, 3.91, 19743, 815, 4.13, 'Europe'),
(447, 'Azerbaijan', 30446, 423, 23242, 6781, 396, 6, 558, 1.39, 76.34, 1.82, 27890, 2556, 9.16, 'Europe'),
(448, 'Bahamas', 382, 11, 91, 280, 40, 0, 0, 2.88, 23.82, 12.09, 174, 208, 119.54, 'Americas'),
(449, 'Bahrain', 39482, 141, 36110, 3231, 351, 1, 421, 0.36, 91.46, 0.39, 36936, 2546, 6.89, 'Eastern Mediterranean'),
(450, 'Bangladesh', 226225, 2965, 125683, 97577, 2772, 37, 1801, 1.31, 55.56, 2.36, 207453, 18772, 9.05, 'South-East Asia'),
(451, 'Barbados', 110, 7, 94, 9, 0, 0, 0, 6.36, 85.45, 7.45, 106, 4, 3.77, 'Americas'),
(452, 'Belarus', 67251, 538, 60492, 6221, 119, 4, 67, 0.8, 89.95, 0.89, 66213, 1038, 1.57, 'Europe'),
(453, 'Belgium', 66428, 9822, 17452, 39154, 402, 1, 14, 14.79, 26.27, 56.28, 64094, 2334, 3.64, 'Europe'),
(454, 'Belize', 48, 2, 26, 20, 0, 0, 0, 4.17, 54.17, 7.69, 40, 8, 20, 'Americas'),
(455, 'Benin', 1770, 35, 1036, 699, 0, 0, 0, 1.98, 58.53, 3.38, 1602, 168, 10.49, 'Africa'),
(456, 'Bhutan', 99, 0, 86, 13, 4, 0, 1, 0, 86.87, 0, 90, 9, 10, 'South-East Asia'),
(457, 'Bolivia', 71181, 2647, 21478, 47056, 1752, 64, 309, 3.72, 30.17, 12.32, 60991, 10190, 16.71, 'Americas'),
(458, 'Bosnia and Herzegovina', 10498, 294, 4930, 5274, 731, 14, 375, 2.8, 46.96, 5.96, 8479, 2019, 23.81, 'Europe'),
(459, 'Botswana', 739, 2, 63, 674, 53, 1, 11, 0.27, 8.53, 3.17, 522, 217, 41.57, 'Africa'),
(460, 'Brazil', 2442375, 87618, 1846641, 508116, 23284, 614, 33728, 3.59, 75.61, 4.74, 2118646, 323729, 15.28, 'Americas'),
(461, 'Brunei', 141, 3, 138, 0, 0, 0, 0, 2.13, 97.87, 2.17, 141, 0, 0, 'Western Pacific'),
(462, 'Bulgaria', 10621, 347, 5585, 4689, 194, 7, 230, 3.27, 52.58, 6.21, 8929, 1692, 18.95, 'Europe'),
(463, 'Burkina Faso', 1100, 53, 926, 121, 14, 0, 6, 4.82, 84.18, 5.72, 1065, 35, 3.29, 'Africa'),
(464, 'Burma', 350, 6, 292, 52, 0, 0, 2, 1.71, 83.43, 2.05, 341, 9, 2.64, 'South-East Asia'),
(465, 'Burundi', 378, 1, 301, 76, 17, 0, 22, 0.26, 79.63, 0.33, 322, 56, 17.39, 'Africa'),
(466, 'Cabo Verde', 2328, 22, 1550, 756, 21, 0, 103, 0.95, 66.58, 1.42, 2071, 257, 12.41, 'Africa'),
(467, 'Cambodia', 226, 0, 147, 79, 1, 0, 4, 0, 65.04, 0, 171, 55, 32.16, 'Western Pacific'),
(468, 'Cameroon', 17110, 391, 14539, 2180, 402, 6, 0, 2.29, 84.97, 2.69, 16157, 953, 5.9, 'Africa'),
(469, 'Canada', 116458, 8944, 0, 107514, 682, 11, 0, 7.68, 0, 0, 112925, 3533, 3.13, 'Americas'),
(470, 'Central African Republic', 4599, 59, 1546, 2994, 0, 0, 0, 1.28, 33.62, 3.82, 4548, 51, 1.12, 'Africa'),
(471, 'Chad', 922, 75, 810, 37, 7, 0, 0, 8.13, 87.85, 9.26, 889, 33, 3.71, 'Africa'),
(472, 'Chile', 347923, 9187, 319954, 18782, 2133, 75, 1859, 2.64, 91.96, 2.87, 333029, 14894, 4.47, 'Americas'),
(473, 'China', 86783, 4656, 78869, 3258, 213, 4, 7, 5.37, 90.88, 5.9, 85622, 1161, 1.36, 'Western Pacific'),
(474, 'Colombia', 257101, 8777, 131161, 117163, 16306, 508, 11494, 3.41, 51.02, 6.69, 204005, 53096, 26.03, 'Americas'),
(475, 'Comoros', 354, 7, 328, 19, 0, 0, 0, 1.98, 92.66, 2.13, 334, 20, 5.99, 'Africa'),
(476, 'Congo (Brazzaville)', 3200, 54, 829, 2317, 162, 3, 73, 1.69, 25.91, 6.51, 2851, 349, 12.24, 'Africa'),
(477, 'Congo (Kinshasa)', 8844, 208, 5700, 2936, 13, 4, 190, 2.35, 64.45, 3.65, 8443, 401, 4.75, 'Africa'),
(478, 'Costa Rica', 15841, 115, 3824, 11902, 612, 11, 88, 0.73, 24.14, 3.01, 11534, 4307, 37.34, 'Americas'),
(479, 'Cote d\'Ivoire', 15655, 96, 10361, 5198, 59, 0, 183, 0.61, 66.18, 0.93, 14312, 1343, 9.38, 'Africa'),
(480, 'Croatia', 4881, 139, 3936, 806, 24, 3, 70, 2.85, 80.64, 3.53, 4370, 511, 11.69, 'Europe'),
(481, 'Cuba', 2532, 87, 2351, 94, 37, 0, 2, 3.44, 92.85, 3.7, 2446, 86, 3.52, 'Americas'),
(482, 'Cyprus', 1060, 19, 852, 189, 3, 0, 0, 1.79, 80.38, 2.23, 1038, 22, 2.12, 'Europe'),
(483, 'Czechia', 15516, 373, 11428, 3715, 192, 2, 0, 2.4, 73.65, 3.26, 14098, 1418, 10.06, 'Europe'),
(484, 'Denmark', 13761, 613, 12605, 543, 109, 0, 77, 4.45, 91.6, 4.86, 13453, 308, 2.29, 'Europe'),
(485, 'Djibouti', 5059, 58, 4977, 24, 9, 0, 11, 1.15, 98.38, 1.17, 5020, 39, 0.78, 'Eastern Mediterranean'),
(486, 'Dominica', 18, 0, 18, 0, 0, 0, 0, 0, 100, 0, 18, 0, 0, 'Americas'),
(487, 'Dominican Republic', 64156, 1083, 30204, 32869, 1248, 20, 1601, 1.69, 47.08, 3.59, 53956, 10200, 18.9, 'Americas'),
(488, 'Ecuador', 81161, 5532, 34896, 40733, 467, 17, 0, 6.82, 43, 15.85, 74620, 6541, 8.77, 'Americas'),
(489, 'Egypt', 92482, 4652, 34838, 52992, 420, 46, 1007, 5.03, 37.67, 13.35, 88402, 4080, 4.62, 'Eastern Mediterranean'),
(490, 'El Salvador', 15035, 408, 7778, 6849, 405, 8, 130, 2.71, 51.73, 5.25, 12207, 2828, 23.17, 'Americas'),
(491, 'Equatorial Guinea', 3071, 51, 842, 2178, 0, 0, 0, 1.66, 27.42, 6.06, 3071, 0, 0, 'Africa'),
(492, 'Eritrea', 265, 0, 191, 74, 2, 0, 2, 0, 72.08, 0, 251, 14, 5.58, 'Africa'),
(493, 'Estonia', 2034, 69, 1923, 42, 0, 0, 1, 3.39, 94.54, 3.59, 2021, 13, 0.64, 'Europe'),
(494, 'Eswatini', 2316, 34, 1025, 1257, 109, 2, 39, 1.47, 44.26, 3.32, 1826, 490, 26.83, 'Africa'),
(495, 'Ethiopia', 14547, 228, 6386, 7933, 579, 5, 170, 1.57, 43.9, 3.57, 10207, 4340, 42.52, 'Africa'),
(496, 'Fiji', 27, 0, 18, 9, 0, 0, 0, 0, 66.67, 0, 27, 0, 0, 'Western Pacific'),
(497, 'Finland', 7398, 329, 6920, 149, 5, 0, 0, 4.45, 93.54, 4.75, 7340, 58, 0.79, 'Europe'),
(498, 'France', 220352, 30212, 81212, 108928, 2551, 17, 267, 13.71, 36.86, 37.2, 214023, 6329, 2.96, 'Europe'),
(499, 'Gabon', 7189, 49, 4682, 2458, 205, 0, 219, 0.68, 65.13, 1.05, 6433, 756, 11.75, 'Africa'),
(500, 'Gambia', 326, 8, 66, 252, 49, 2, 6, 2.45, 20.25, 12.12, 112, 214, 191.07, 'Africa'),
(501, 'Georgia', 1137, 16, 922, 199, 6, 0, 2, 1.41, 81.09, 1.74, 1039, 98, 9.43, 'Europe'),
(502, 'Germany', 207112, 9125, 190314, 7673, 445, 1, 259, 4.41, 91.89, 4.79, 203325, 3787, 1.86, 'Europe'),
(503, 'Ghana', 33624, 168, 29801, 3655, 655, 0, 307, 0.5, 88.63, 0.56, 28430, 5194, 18.27, 'Africa'),
(504, 'Greece', 4227, 202, 1374, 2651, 34, 0, 0, 4.78, 32.51, 14.7, 4012, 215, 5.36, 'Europe'),
(505, 'Greenland', 14, 0, 13, 1, 1, 0, 0, 0, 92.86, 0, 13, 1, 7.69, 'Europe'),
(506, 'Grenada', 23, 0, 23, 0, 0, 0, 0, 0, 100, 0, 23, 0, 0, 'Americas'),
(507, 'Guatemala', 45309, 1761, 32455, 11093, 256, 27, 843, 3.89, 71.63, 5.43, 39039, 6270, 16.06, 'Americas'),
(508, 'Guinea', 7055, 45, 6257, 753, 47, 2, 105, 0.64, 88.69, 0.72, 6590, 465, 7.06, 'Africa'),
(509, 'Guinea-Bissau', 1954, 26, 803, 1125, 0, 0, 0, 1.33, 41.1, 3.24, 1949, 5, 0.26, 'Africa'),
(510, 'Guyana', 389, 20, 181, 188, 19, 0, 0, 5.14, 46.53, 11.05, 337, 52, 15.43, 'Americas'),
(511, 'Haiti', 7340, 158, 4365, 2817, 25, 1, 0, 2.15, 59.47, 3.62, 7053, 287, 4.07, 'Americas'),
(512, 'Holy See', 12, 0, 12, 0, 0, 0, 0, 0, 100, 0, 12, 0, 0, 'Europe'),
(513, 'Honduras', 39741, 1166, 5039, 33536, 465, 50, 117, 2.93, 12.68, 23.14, 34611, 5130, 14.82, 'Americas'),
(514, 'Hungary', 4448, 596, 3329, 523, 13, 0, 0, 13.4, 74.84, 17.9, 4339, 109, 2.51, 'Europe'),
(515, 'Iceland', 1854, 10, 1823, 21, 7, 0, 0, 0.54, 98.33, 0.55, 1839, 15, 0.82, 'Europe'),
(516, 'India', 1480073, 33408, 951166, 495499, 44457, 637, 33598, 2.26, 64.26, 3.51, 1155338, 324735, 28.11, 'South-East Asia'),
(517, 'Indonesia', 100303, 4838, 58173, 37292, 1525, 57, 1518, 4.82, 58, 8.32, 88214, 12089, 13.7, 'South-East Asia'),
(518, 'Iran', 293606, 15912, 255144, 22550, 2434, 212, 1931, 5.42, 86.9, 6.24, 276202, 17404, 6.3, 'Eastern Mediterranean'),
(519, 'Iraq', 112585, 4458, 77144, 30983, 2553, 96, 1927, 3.96, 68.52, 5.78, 94693, 17892, 18.89, 'Eastern Mediterranean'),
(520, 'Ireland', 25892, 1764, 23364, 764, 11, 0, 0, 6.81, 90.24, 7.55, 25766, 126, 0.49, 'Europe'),
(521, 'Israel', 63985, 474, 27133, 36378, 2029, 4, 108, 0.74, 42.41, 1.75, 52003, 11982, 23.04, 'Europe'),
(522, 'Italy', 246286, 35112, 198593, 12581, 168, 5, 147, 14.26, 80.64, 17.68, 244624, 1662, 0.68, 'Europe'),
(523, 'Jamaica', 853, 10, 714, 129, 11, 0, 0, 1.17, 83.7, 1.4, 809, 44, 5.44, 'Americas'),
(524, 'Japan', 31142, 998, 21970, 8174, 594, 0, 364, 3.2, 70.55, 4.54, 25706, 5436, 21.15, 'Western Pacific'),
(525, 'Jordan', 1176, 11, 1041, 124, 8, 0, 0, 0.94, 88.52, 1.06, 1223, -47, -3.84, 'Eastern Mediterranean'),
(526, 'Kazakhstan', 84648, 585, 54404, 29659, 1526, 0, 1833, 0.69, 64.27, 1.08, 73468, 11180, 15.22, 'Europe'),
(527, 'Kenya', 17975, 285, 7833, 9857, 372, 5, 90, 1.59, 43.58, 3.64, 13771, 4204, 30.53, 'Africa'),
(528, 'Kosovo', 7413, 185, 4027, 3201, 496, 16, 274, 2.5, 54.32, 4.59, 5877, 1536, 26.14, 'Europe'),
(529, 'Kuwait', 64379, 438, 55057, 8884, 606, 5, 684, 0.68, 85.52, 0.8, 59763, 4616, 7.72, 'Eastern Mediterranean'),
(530, 'Kyrgyzstan', 33296, 1301, 21205, 10790, 483, 24, 817, 3.91, 63.69, 6.14, 27143, 6153, 22.67, 'Europe'),
(531, 'Laos', 20, 0, 19, 1, 0, 0, 0, 0, 95, 0, 19, 1, 5.26, 'Western Pacific'),
(532, 'Latvia', 1219, 31, 1045, 143, 0, 0, 0, 2.54, 85.73, 2.97, 1192, 27, 2.27, 'Europe'),
(533, 'Lebanon', 3882, 51, 1709, 2122, 132, 0, 17, 1.31, 44.02, 2.98, 2905, 977, 33.63, 'Eastern Mediterranean'),
(534, 'Lesotho', 505, 12, 128, 365, 0, 0, 0, 2.38, 25.35, 9.38, 359, 146, 40.67, 'Africa'),
(535, 'Liberia', 1167, 72, 646, 449, 5, 0, 5, 6.17, 55.36, 11.15, 1107, 60, 5.42, 'Africa'),
(536, 'Libya', 2827, 64, 577, 2186, 158, 4, 24, 2.26, 20.41, 11.09, 1980, 847, 42.78, 'Eastern Mediterranean'),
(537, 'Liechtenstein', 86, 1, 81, 4, 0, 0, 0, 1.16, 94.19, 1.23, 86, 0, 0, 'Europe'),
(538, 'Lithuania', 2019, 80, 1620, 319, 11, 0, 4, 3.96, 80.24, 4.94, 1947, 72, 3.7, 'Europe'),
(539, 'Luxembourg', 6321, 112, 4825, 1384, 49, 0, 178, 1.77, 76.33, 2.32, 5639, 682, 12.09, 'Europe'),
(540, 'Madagascar', 9690, 91, 6260, 3339, 395, 6, 681, 0.94, 64.6, 1.45, 7153, 2537, 35.47, 'Africa'),
(541, 'Malawi', 3664, 99, 1645, 1920, 24, 0, 6, 2.7, 44.9, 6.02, 2992, 672, 22.46, 'Africa'),
(542, 'Malaysia', 8904, 124, 8601, 179, 7, 0, 1, 1.39, 96.6, 1.44, 8800, 104, 1.18, 'Western Pacific'),
(543, 'Maldives', 3369, 15, 2547, 807, 67, 0, 19, 0.45, 75.6, 0.59, 2999, 370, 12.34, 'South-East Asia'),
(544, 'Mali', 2513, 124, 1913, 476, 3, 1, 2, 4.93, 76.12, 6.48, 2475, 38, 1.54, 'Africa'),
(545, 'Malta', 701, 9, 665, 27, 1, 0, 0, 1.28, 94.86, 1.35, 677, 24, 3.55, 'Europe'),
(546, 'Mauritania', 6208, 156, 4653, 1399, 37, 0, 223, 2.51, 74.95, 3.35, 5923, 285, 4.81, 'Africa'),
(547, 'Mauritius', 344, 10, 332, 2, 0, 0, 0, 2.91, 96.51, 3.01, 343, 1, 0.29, 'Africa'),
(548, 'Mexico', 395489, 44022, 303810, 47657, 4973, 342, 8588, 11.13, 76.82, 14.49, 349396, 46093, 13.19, 'Americas'),
(549, 'Moldova', 23154, 748, 16154, 6252, 120, 13, 245, 3.23, 69.77, 4.63, 21115, 2039, 9.66, 'Europe'),
(550, 'Monaco', 116, 4, 104, 8, 0, 0, 0, 3.45, 89.66, 3.85, 109, 7, 6.42, 'Europe'),
(551, 'Mongolia', 289, 0, 222, 67, 1, 0, 4, 0, 76.82, 0, 287, 2, 0.7, 'Western Pacific'),
(552, 'Montenegro', 2893, 45, 809, 2039, 94, 2, 70, 1.56, 27.96, 5.56, 2188, 705, 32.22, 'Europe'),
(553, 'Morocco', 20887, 316, 16553, 4018, 609, 3, 115, 1.51, 79.25, 1.91, 17562, 3325, 18.93, 'Eastern Mediterranean'),
(554, 'Mozambique', 1701, 11, 0, 1690, 32, 0, 0, 0.65, 0, 0, 1507, 194, 12.87, 'Africa'),
(555, 'Namibia', 1843, 8, 101, 1734, 68, 0, 26, 0.43, 5.48, 7.92, 1344, 499, 37.13, 'Africa'),
(556, 'Nepal', 18752, 48, 13754, 4950, 139, 3, 626, 0.26, 73.35, 0.35, 17844, 908, 5.09, 'South-East Asia'),
(557, 'Netherlands', 53413, 6160, 189, 47064, 419, 1, 0, 11.53, 0.35, 3259.26, 52132, 1281, 2.46, 'Europe'),
(558, 'New Zealand', 1557, 22, 1514, 21, 1, 0, 1, 1.41, 97.24, 1.45, 1555, 2, 0.13, 'Western Pacific'),
(559, 'Nicaragua', 3439, 108, 2492, 839, 0, 0, 0, 3.14, 72.46, 4.33, 3147, 292, 9.28, 'Americas'),
(560, 'Niger', 1132, 69, 1027, 36, 0, 0, 0, 6.1, 90.72, 6.72, 1105, 27, 2.44, 'Africa'),
(561, 'Nigeria', 41180, 860, 18203, 22117, 648, 2, 829, 2.09, 44.2, 4.72, 37225, 3955, 10.62, 'Africa'),
(562, 'North Macedonia', 10213, 466, 5564, 4183, 127, 6, 137, 4.56, 54.48, 8.38, 9249, 964, 10.42, 'Europe'),
(563, 'Norway', 9132, 255, 8752, 125, 15, 0, 0, 2.79, 95.84, 2.91, 9034, 98, 1.08, 'Europe'),
(564, 'Oman', 77058, 393, 57028, 19637, 1053, 9, 1729, 0.51, 74.01, 0.69, 68400, 8658, 12.66, 'Eastern Mediterranean'),
(565, 'Pakistan', 274289, 5842, 241026, 27421, 1176, 20, 3592, 2.13, 87.87, 2.42, 266096, 8193, 3.08, 'Eastern Mediterranean'),
(566, 'Panama', 61442, 1322, 35086, 25034, 1146, 28, 955, 2.15, 57.1, 3.77, 54426, 7016, 12.89, 'Americas'),
(567, 'Papua New Guinea', 62, 0, 11, 51, 0, 0, 0, 0, 17.74, 0, 19, 43, 226.32, 'Western Pacific'),
(568, 'Paraguay', 4548, 43, 2905, 1600, 104, 2, 111, 0.95, 63.87, 1.48, 3748, 800, 21.34, 'Americas'),
(569, 'Peru', 389717, 18418, 272547, 98752, 13756, 575, 4697, 4.73, 69.93, 6.76, 357681, 32036, 8.96, 'Americas'),
(570, 'Philippines', 82040, 1945, 26446, 53649, 1592, 13, 336, 2.37, 32.24, 7.35, 68898, 13142, 19.07, 'Western Pacific'),
(571, 'Poland', 43402, 1676, 32856, 8870, 337, 5, 103, 3.86, 75.7, 5.1, 40383, 3019, 7.48, 'Europe'),
(572, 'Portugal', 50299, 1719, 35375, 13205, 135, 2, 158, 3.42, 70.33, 4.86, 48771, 1528, 3.13, 'Europe'),
(573, 'Qatar', 109597, 165, 106328, 3104, 292, 0, 304, 0.15, 97.02, 0.16, 107037, 2560, 2.39, 'Eastern Mediterranean'),
(574, 'Romania', 45902, 2206, 25794, 17902, 1104, 19, 151, 4.81, 56.19, 8.55, 38139, 7763, 20.35, 'Europe'),
(575, 'Russia', 816680, 13334, 602249, 201097, 5607, 85, 3077, 1.63, 73.74, 2.21, 776212, 40468, 5.21, 'Europe'),
(576, 'Rwanda', 1879, 5, 975, 899, 58, 0, 57, 0.27, 51.89, 0.51, 1629, 250, 15.35, 'Africa'),
(577, 'Saint Kitts and Nevis', 17, 0, 15, 2, 0, 0, 0, 0, 88.24, 0, 17, 0, 0, 'Americas'),
(578, 'Saint Lucia', 24, 0, 22, 2, 0, 0, 0, 0, 91.67, 0, 23, 1, 4.35, 'Americas'),
(579, 'Saint Vincent and the Grenadines', 52, 0, 39, 13, 0, 0, 0, 0, 75, 0, 50, 2, 4, 'Americas'),
(580, 'San Marino', 699, 42, 657, 0, 0, 0, 0, 6.01, 93.99, 6.39, 699, 0, 0, 'Europe'),
(581, 'Sao Tome and Principe', 865, 14, 734, 117, 2, 0, 38, 1.62, 84.86, 1.91, 746, 119, 15.95, 'Africa'),
(582, 'Saudi Arabia', 268934, 2760, 222936, 43238, 1993, 27, 2613, 1.03, 82.9, 1.24, 253349, 15585, 6.15, 'Eastern Mediterranean'),
(583, 'Senegal', 9764, 194, 6477, 3093, 83, 3, 68, 1.99, 66.34, 3, 8948, 816, 9.12, 'Africa'),
(584, 'Serbia', 24141, 543, 0, 23598, 411, 9, 0, 2.25, 0, 0, 21253, 2888, 13.59, 'Europe'),
(585, 'Seychelles', 114, 0, 39, 75, 0, 0, 0, 0, 34.21, 0, 108, 6, 5.56, 'Africa'),
(586, 'Sierra Leone', 1783, 66, 1317, 400, 0, 0, 4, 3.7, 73.86, 5.01, 1711, 72, 4.21, 'Africa'),
(587, 'Singapore', 50838, 27, 45692, 5119, 469, 0, 171, 0.05, 89.88, 0.06, 48035, 2803, 5.84, 'Western Pacific'),
(588, 'Slovakia', 2181, 28, 1616, 537, 2, 0, 39, 1.28, 74.09, 1.73, 1980, 201, 10.15, 'Europe'),
(589, 'Slovenia', 2087, 116, 1733, 238, 5, 0, 55, 5.56, 83.04, 6.69, 1953, 134, 6.86, 'Europe'),
(590, 'Somalia', 3196, 93, 1543, 1560, 18, 0, 22, 2.91, 48.28, 6.03, 3130, 66, 2.11, 'Eastern Mediterranean'),
(591, 'South Africa', 452529, 7067, 274925, 170537, 7096, 298, 9848, 1.56, 60.75, 2.57, 373628, 78901, 21.12, 'Africa'),
(592, 'South Korea', 14203, 300, 13007, 896, 28, 1, 102, 2.11, 91.58, 2.31, 13816, 387, 2.8, 'Western Pacific'),
(593, 'South Sudan', 2305, 46, 1175, 1084, 43, 1, 0, 2, 50.98, 3.91, 2211, 94, 4.25, 'Africa'),
(594, 'Spain', 272421, 28432, 150376, 93613, 0, 0, 0, 10.44, 55.2, 18.91, 264836, 7585, 2.86, 'Europe'),
(595, 'Sri Lanka', 2805, 11, 2121, 673, 23, 0, 15, 0.39, 75.61, 0.52, 2730, 75, 2.75, 'South-East Asia'),
(596, 'Sudan', 11424, 720, 5939, 4765, 39, 3, 49, 6.3, 51.99, 12.12, 10992, 432, 3.93, 'Eastern Mediterranean'),
(597, 'Suriname', 1483, 24, 925, 534, 44, 1, 35, 1.62, 62.37, 2.59, 1079, 404, 37.44, 'Americas'),
(598, 'Sweden', 79395, 5700, 0, 73695, 398, 3, 0, 7.18, 0, 0, 78048, 1347, 1.73, 'Europe'),
(599, 'Switzerland', 34477, 1978, 30900, 1599, 65, 1, 200, 5.74, 89.62, 6.4, 33634, 843, 2.51, 'Europe'),
(600, 'Syria', 674, 40, 0, 634, 24, 2, 0, 5.93, 0, 0, 522, 152, 29.12, 'Eastern Mediterranean'),
(601, 'Taiwan*', 462, 7, 440, 15, 4, 0, 0, 1.52, 95.24, 1.59, 451, 11, 2.44, 'Western Pacific'),
(602, 'Tajikistan', 7235, 60, 6028, 1147, 43, 1, 58, 0.83, 83.32, 1, 6921, 314, 4.54, 'Europe'),
(603, 'Tanzania', 509, 21, 183, 305, 0, 0, 0, 4.13, 35.95, 11.48, 509, 0, 0, 'Africa'),
(604, 'Thailand', 3297, 58, 3111, 128, 6, 0, 2, 1.76, 94.36, 1.86, 3250, 47, 1.45, 'South-East Asia'),
(605, 'Timor-Leste', 24, 0, 0, 24, 0, 0, 0, 0, 0, 0, 24, 0, 0, 'South-East Asia'),
(606, 'Togo', 874, 18, 607, 249, 6, 0, 8, 2.06, 69.45, 2.97, 783, 91, 11.62, 'Africa'),
(607, 'Trinidad and Tobago', 148, 8, 128, 12, 1, 0, 0, 5.41, 86.49, 6.25, 137, 11, 8.03, 'Americas'),
(608, 'Tunisia', 1455, 50, 1157, 248, 3, 0, 15, 3.44, 79.52, 4.32, 1381, 74, 5.36, 'Eastern Mediterranean'),
(609, 'Turkey', 227019, 5630, 210469, 10920, 919, 17, 982, 2.48, 92.71, 2.67, 220572, 6447, 2.92, 'Europe'),
(610, 'US', 4290259, 148011, 1325804, 2816444, 56336, 1076, 27941, 3.45, 30.9, 11.16, 3834677, 455582, 11.88, 'Americas'),
(611, 'Uganda', 1128, 2, 986, 140, 13, 0, 4, 0.18, 87.41, 0.2, 1069, 59, 5.52, 'Africa'),
(612, 'Ukraine', 67096, 1636, 37202, 28258, 835, 11, 317, 2.44, 55.45, 4.4, 60767, 6329, 10.42, 'Europe'),
(613, 'United Arab Emirates', 59177, 345, 52510, 6322, 264, 1, 328, 0.58, 88.73, 0.66, 57193, 1984, 3.47, 'Eastern Mediterranean'),
(614, 'United Kingdom', 301708, 45844, 1437, 254427, 688, 7, 3, 15.19, 0.48, 3190.26, 296944, 4764, 1.6, 'Europe'),
(615, 'Uruguay', 1202, 35, 951, 216, 10, 1, 3, 2.91, 79.12, 3.68, 1064, 138, 12.97, 'Americas'),
(616, 'Uzbekistan', 21209, 121, 11674, 9414, 678, 5, 569, 0.57, 55.04, 1.04, 17149, 4060, 23.67, 'Europe'),
(617, 'Venezuela', 15988, 146, 9959, 5883, 525, 4, 213, 0.91, 62.29, 1.47, 12334, 3654, 29.63, 'Americas'),
(618, 'Vietnam', 431, 0, 365, 66, 11, 0, 0, 0, 84.69, 0, 384, 47, 12.24, 'Western Pacific'),
(619, 'West Bank and Gaza', 10621, 78, 3752, 6791, 152, 2, 0, 0.73, 35.33, 2.08, 8916, 1705, 19.12, 'Eastern Mediterranean'),
(620, 'Western Sahara', 10, 1, 8, 1, 0, 0, 0, 10, 80, 12.5, 10, 0, 0, 'Africa');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `covid19`
--
ALTER TABLE `covid19`
  ADD PRIMARY KEY (`Id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `covid19`
--
ALTER TABLE `covid19`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=644;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
