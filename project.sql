-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 29, 2017 at 12:43 PM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 7.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `project`
--

-- --------------------------------------------------------

--
-- Table structure for table `current_affairs`
--

CREATE TABLE `current_affairs` (
  `SNo` int(11) NOT NULL,
  `Question` varchar(500) NOT NULL,
  `Answer` varchar(50) NOT NULL,
  `Option1` varchar(50) NOT NULL,
  `Option2` varchar(50) NOT NULL,
  `Option3` varchar(50) NOT NULL,
  `Option4` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

--
-- Dumping data for table `current_affairs`
--

INSERT INTO `current_affairs` (`SNo`, `Question`, `Answer`, `Option1`, `Option2`, `Option3`, `Option4`) VALUES
(1, 'Nicos Anastasiades, who was on an official visit to India in April 2017, is the President of:', 'Cyprus', 'Cyprus', 'Belgium', 'Austria', 'Sweden'),
(2, 'Prime Minister Narendra Modi released a commemorative stamp on the _______ birth anniversary of Saint Ramanujacharya on May 1, 2017 in New Delhi.', '1000th', '800th', '900th', '1000th', '1100th'),
(3, 'Which state became first Indian state to use Automated Weather Station?', 'Maharashtra', 'Gujarat', 'Maharashtra', 'Uttar Pradesh', 'Uttarakhand'),
(4, 'who among the following has been chosen for the prestigious Indian National Science Academy(INSA) medal for the Young Scientist Award for the year 2017?', 'Sanjay Pratihar', 'Sanjay Pratihar', 'Naresh Lodha', 'Murari Tripathi', 'Prateek Desai'),
(5, 'Which tennis player has won the Barcelona Open title for a record 10th time?', 'Rafael Nadal', 'Noval Djokovic', 'Rafael Nadal', 'Andy Murray', 'Roger Federer'),
(6, 'Every year, \"World Asthma Day\" is observed on:', 'First Tuesday of May', '2nd May', '1st May', 'First Sunday of Monday', 'First Tuesday of May'),
(7, 'Who among the following has been selected for the Transformative Chief Minister Award in recognition for his role in advancing the US-India partnership at the state level', 'Andhra Pradesh Chief Minister Chandrababu Naidu', 'Andhra Pradesh Chief Minister Chandrababu Naidu', 'Gujarat chief Minister Vijay Rupani', 'Maharashtra chief Minister Devendra Fadnavis', 'Assam chief Minister Sarbananda Sonowal'),
(8, 'On May 1, 2017, Indias second tallest flag pole was inaugrated in which district of Maharashtra?', 'Kolhapur', 'Jalna', 'Dhule', 'Aurangabad', 'Kolhapur'),
(9, 'Which State Government has launched ambulance service for injured and ill cows?', 'Uttar Pradesh', 'Uttar Pradesh', 'Maharashtra', 'Gujarat', 'Rajasthan'),
(10, 'Reserve Bank of India has fixed the rate of interest on the Floating Rate Bonds, 2024(FRB 2024) for the half year May 7, 2017 to November 6,2017 at:', '6.30%', '6.20%', '6.30%', '6.40%', '6.50%'),
(11, 'which among the following became the first city in the world to get its own Microsoft designed font?', 'Dubai', 'Paris', 'London', 'Berlin', 'Dubai'),
(12, 'Who among the following has been honoured by Tamil Nadu State Government with \"Avvaiyer Award\" for 2017?', 'Padma Venkataraman', 'Padma Venkataraman', 'Vaidehi Chinappa', 'Shruti Iyer', 'Srilata Venkatesh'),
(13, 'Which portal has been launched by Government to allow people to check electromagnetic radiation(EMF) compliance status of mobile towers?', 'Tarang Sanchar', 'Tarang Prasadhan', 'Tarang Mahiti', 'Tarang Sanchar', 'Tarang Jaanch'),
(14, 'Ueli Steck, who passed away on April 30, 2017, as a renowned:', 'Mountaineer', 'Novel Writer', 'Football Player', 'Formula 1 Driver', 'Mountaineer'),
(15, 'Which among the following has become the first state to switch to the January- December financial year from the existing April-March cycle?', 'Madhya Pradesh', 'Gujarat', 'Madhya Pradesh', 'Goa', 'Karnataka');

-- --------------------------------------------------------

--
-- Table structure for table `current_affairs_rank`
--

CREATE TABLE `current_affairs_rank` (
  `Username` varchar(50) NOT NULL,
  `score` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

--
-- Dumping data for table `current_affairs_rank`
--

INSERT INTO `current_affairs_rank` (`Username`, `score`) VALUES
('ittirehan', 12),
('vishaldabas', 5);

-- --------------------------------------------------------

--
-- Table structure for table `history`
--

CREATE TABLE `history` (
  `SNo` int(11) NOT NULL,
  `Question` varchar(500) NOT NULL,
  `Answer` varchar(50) NOT NULL,
  `Option1` varchar(50) NOT NULL,
  `Option2` varchar(50) NOT NULL,
  `Option3` varchar(50) NOT NULL,
  `Option4` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `history`
--

INSERT INTO `history` (`SNo`, `Question`, `Answer`, `Option1`, `Option2`, `Option3`, `Option4`) VALUES
(1, 'The Oldest Dynasty ruling in which country?', 'Japan', 'Japan', 'Austria', 'Iran', 'England'),
(2, 'Who was the firs woman whose name appeared in history?', 'Queen Hatshepsut', 'Golda Meir', 'Queen Hatshepsut', 'Queen Elizabeth 1', 'Jansi Rani'),
(3, 'The First World War began in which year?', '1914', '1915', '1918', '1916', '1914'),
(4, 'The arrival of Vasco da Gama in Calicut, India was in which Year?', '1498', '1398', '1495', '1496', '1498'),
(5, 'Diu was the colony of which country?', 'Portuguese', 'Portuguese', 'English', 'Dutch', 'French'),
(6, 'In 1612 which country established a trading post in Gujarat?', 'British', 'British', 'French', 'Spain', 'Dutch'),
(7, 'In 1614 Sir Thomas Roe was instructed by whom to visit the court of Jahangir', 'James', 'James', 'Shahjaha', 'Babar', 'Humayun'),
(8, 'Year of Battle of Plassey was in?', '1757', '1557', '1657', '1757', '1857'),
(9, 'Year of Battle of Buxar is?', '1764', '1764', '1767', '1784', '1864'),
(10, 'Warren Hastings was appointed as Governor of which State in 1772?', 'Bengal', 'Bengal', 'Madras', 'Bombay', 'Delhi'),
(11, 'Regulating Act was in which Year?', '1773', '1573', '1673', '1773', '1873'),
(12, 'Hyder Ali was ruler of which state?', 'Mysore', 'Hyderabad', 'Mysore', 'Cochi', 'Bengal'),
(13, 'Mahe was a colony of which country?', 'French', 'English', 'French', 'Dutch', 'Germany'),
(14, 'In November 1781,Sir Eyre Coote defeated who at Porto Nova?', 'Hyder Ali', 'Hyder Ali', 'Marthanda Verma', 'British', 'Tipu Sultan'),
(15, 'Serinagapatnam was capital of?', 'Tipu Sultan', 'Pazhassi Raja', 'Tipu Sultan', 'Kurumbranad  Raja', 'Srimoolan Tirumal');

-- --------------------------------------------------------

--
-- Table structure for table `history_rank`
--

CREATE TABLE `history_rank` (
  `Username` varchar(50) NOT NULL,
  `score` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

--
-- Dumping data for table `history_rank`
--

INSERT INTO `history_rank` (`Username`, `score`) VALUES
('Riya', 3),
('tanmay', 7);

-- --------------------------------------------------------

--
-- Table structure for table `ittirehan`
--

CREATE TABLE `ittirehan` (
  `SNo` int(11) DEFAULT NULL,
  `Answer` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ittirehan`
--

INSERT INTO `ittirehan` (`SNo`, `Answer`) VALUES
(1, 'Fireman'),
(2, 'Pizza'),
(3, '2'),
(4, '5.5ft'),
(5, 'Sandeep'),
(6, 'Goa'),
(7, 'Spring'),
(8, 'Sky Diving'),
(9, 'Charisma'),
(10, '2'),
(11, 'Yes mostly'),
(12, 'Go to a trip'),
(13, 'Vampire'),
(14, 'Horse'),
(15, 'Short');

-- --------------------------------------------------------

--
-- Table structure for table `ittirehan_rank`
--

CREATE TABLE `ittirehan_rank` (
  `Username` varchar(50) DEFAULT NULL,
  `score` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ittirehan_rank`
--

INSERT INTO `ittirehan_rank` (`Username`, `score`) VALUES
('ittirehan', 15),
('Riya', 8),
('vishaldabas', 15);

-- --------------------------------------------------------

--
-- Table structure for table `personalque`
--

CREATE TABLE `personalque` (
  `SNo` int(11) NOT NULL,
  `Question` varchar(500) NOT NULL,
  `Option1` varchar(100) NOT NULL,
  `Option2` varchar(100) NOT NULL,
  `Option3` varchar(100) NOT NULL,
  `Option4` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `personalque`
--

INSERT INTO `personalque` (`SNo`, `Question`, `Option1`, `Option2`, `Option3`, `Option4`) VALUES
(1, 'What did he/she want to become when they were child?', 'Professor', 'Fireman', 'Doctor', 'Singer'),
(2, 'What would he/she like right now?', 'To be hugged', 'Pizza', 'A bed with big pillows', 'To be with someone special'),
(3, 'How many languages does he/she speak?', '1', '2', '3', '4'),
(4, 'How tall is he/she?', '5 ft', '5.5ft', '6ft', '5.8ft'),
(5, 'If he/she were to change name, what would it be?', 'Amanpreet', 'Sandeep', 'Gurpreet', 'Harpreet'),
(6, 'Favourite city?', 'Jalandhar', 'Goa', 'Delhi', 'Chandigarh'),
(7, 'Favourite season?', 'Winter', 'Spring', 'Summer', 'Fall'),
(8, 'What would she/he do for an adventure?', 'River Rafting', 'Sky Diving', 'Paragliding', 'Rock climbing'),
(9, 'Which trait is sure to seduce he/she every time?', 'Humor', 'Charisma', 'Social Standing', 'Physique'),
(10, 'How many kids does he/she want with his/her partner?', '1', '2', 'More than 2', 'doesnt want kids'),
(11, 'Is he/she faithful?', 'Yes always', 'Yes mostly', 'Yes seldom', 'Never'),
(12, 'If he/she wins a lottery, what would he/she do with that money?', 'Save the money', 'Go to a trip', 'Buy a house', 'Will throw a lavish party'),
(13, 'Whom will he/she date?', 'Human', 'Vampire', 'Werewolf', 'Ghost'),
(14, 'If he/she were a farm animal, what would he/she be?', 'Chicken', 'Horse', 'Cow', 'Goat'),
(15, 'Does he/she wear long or short socks?', 'Long', 'Short', 'doesnt wear socks', 'Both');

-- --------------------------------------------------------

--
-- Table structure for table `personal_ans`
--

CREATE TABLE `personal_ans` (
  `table_name` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `personal_ans`
--

INSERT INTO `personal_ans` (`table_name`) VALUES
('ittirehan'),
('riya'),
('v'),
('tanmay');

-- --------------------------------------------------------

--
-- Table structure for table `riya`
--

CREATE TABLE `riya` (
  `SNo` int(11) DEFAULT NULL,
  `Answer` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `riya`
--

INSERT INTO `riya` (`SNo`, `Answer`) VALUES
(1, 'Doctor'),
(2, 'To be with someone special'),
(3, '3'),
(4, '5.8ft'),
(5, 'Gurpreet'),
(6, 'Goa'),
(7, 'Spring'),
(8, 'River Rafting'),
(9, 'Physique'),
(10, '2'),
(11, 'Yes mostly'),
(12, 'Go to a trip'),
(13, 'Ghost'),
(14, 'Horse'),
(15, 'Both');

-- --------------------------------------------------------

--
-- Table structure for table `riya_rank`
--

CREATE TABLE `riya_rank` (
  `Username` varchar(50) DEFAULT NULL,
  `score` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `riya_rank`
--

INSERT INTO `riya_rank` (`Username`, `score`) VALUES
('Riya', 15);

-- --------------------------------------------------------

--
-- Table structure for table `sports`
--

CREATE TABLE `sports` (
  `SNo` int(11) NOT NULL,
  `Question` varchar(500) NOT NULL,
  `Answer` varchar(501) NOT NULL,
  `Option1` varchar(501) NOT NULL,
  `Option2` varchar(501) NOT NULL,
  `Option3` varchar(501) NOT NULL,
  `Option4` varchar(501) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `sports`
--

INSERT INTO `sports` (`SNo`, `Question`, `Answer`, `Option1`, `Option2`, `Option3`, `Option4`) VALUES
(1, 'Who has taken over as the Director of Operations at the Bangalore based National Cricket Academy in place of his predecessor Dave Whatmore that joined IPL team Kolkata Knight Raiders recently?', 'Sandeep Patil ', 'Kapil Dev ', 'Madan Lal', 'Sanjay Manjrekar ', 'Sandeep Patil '),
(2, 'Of which two sports have actors Mohanlal and Mammootty become goodwill ambassadors in Kerala recently?', 'Athletics & Volleyball ', 'Football & Boat racing ', 'Judo & Table Tennis', 'Basketball & Cricket', 'Athletics & Volleyball '),
(3, ' Olympic gold medallist Abhinav Bindra will be the new face to promote guns made by which company? ', 'Walther', 'Mouser ', 'Walther', 'Uzi', 'Colt'),
(4, 'Mahela Jayawardene hit his sixth Test double century in the first Test of the series between India and Sri Lanka at Ahmedabad recently. Who holds the record of exceeding the score of 200 runs in an inning for the highest number of times in Test Cricket till date?', 'Don Bradman', 'Don Bradman', 'Brian Lara ', 'Wally Hammond', 'Marvan Atapattu '),
(5, ' Who won the Shanghai Masters Tennis tournament organised recently?\r\n', 'Nikolay Davydenko ', ' Andy Murray ', 'Nikolay Davydenko ', 'Rafael Nadal ', 'Roger Federer '),
(6, 'Sachin Tendulkar has the second longest One Day International (ODI) career currently. Who holds the record for the longest ODI career spanning 20 years and 272 days?', 'Javed Miandad', 'Allan Border ', 'Kapil Dev ', 'Javed Miandad', 'Brian Lara '),
(7, 'China beat India in the final to win the Asia Cup Hockey Championship for Women in Bangkok recently. Which Indian player was declared the player of the tournament?', 'Subhadra Pradhan', 'Suraj Lata Devi', 'Subhadra Pradhan', 'Mamta Kharab', 'Madhu Yadav '),
(8, 'Who won the 2009 FIFA Under-17 World Cup in Abuja, Nigeria recently?', 'Switzerland ', 'Netherlands', 'Switzerland ', 'Brazil', 'Portugal '),
(9, 'Which of the following statements about the Federation Cup Women\'s Tennis Team tournament organised recently is incorrect?', 'Russia was the losing finalist', 'The final was played at Reggio Calabria', 'Russia was the losing finalist', 'The final was played on clay court ', 'The losing finalist was unable to win a single match in the fina'),
(10, 'Which of the following was selected as the official broadcaster of 2010 Commonwealth Games recently?', 'Satellite Information Service Live', 'Satellite Information Service Live', 'International Games Broadcast Services', 'Nimbus Sports International ', 'Canadian Broadcasting Corporation '),
(11, 'Which well known former Olympic gold medallist is Chairman of the London Organising Committee for the Olympic Games?', 'Sebastian Coe ', 'Daley Thompson', 'Sebastian Coe ', 'Steve Overt', 'Robin Cousins'),
(12, 'Virender Sehwag was in news recently for missing his triple century in the India-Sri Lanka series by less than 10 runs. Who is the only batsman to have scored three triple centuries in Test Cricket?', 'None of the above ', 'Allan Border', 'Donald Bradman', 'Brian Lara', 'None of the above '),
(13, ' Virender Sehwag was in news recently for his score of 293 runs in the first inning of the third test match between India and Sri Lanka in Mumbai. Who has scored the highest number of double centuries in tests for India?', 'Virender Sehwag', 'Virender Sehwag', 'Rahul Dravid ', 'Sunil Gavaskar ', 'Both (1) and (3) '),
(14, 'Which former Test Cricketer of Australia is the Chief Executive Officer of the Federation of International Cricketers\' Association (FICA) that looks after the interest of cricketers of Test playing countries?', 'Tim May', 'Allan Border ', 'Tim May', 'Kim Hughes', 'Tom Moody'),
(15, 'Who was appointed as the new captain of the 21-member Indian Hockey team for the FIH Men\'s Champions Challenge tournament in Salta, Argentina from December 6 to 13?', 'Rajpal Singh', 'Tushar Khandekar', 'Rajpal Singh', 'Dhanraj Pillai ', 'Arjun Halappa');

-- --------------------------------------------------------

--
-- Table structure for table `sports_rank`
--

CREATE TABLE `sports_rank` (
  `Username` varchar(50) NOT NULL,
  `score` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

--
-- Dumping data for table `sports_rank`
--

INSERT INTO `sports_rank` (`Username`, `score`) VALUES
('ittirehan', 3);

-- --------------------------------------------------------

--
-- Table structure for table `tanmay`
--

CREATE TABLE `tanmay` (
  `SNo` int(11) DEFAULT NULL,
  `Answer` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tanmay`
--

INSERT INTO `tanmay` (`SNo`, `Answer`) VALUES
(1, 'Doctor'),
(2, 'A bed with big pillows'),
(3, '3'),
(4, '5.8ft'),
(5, 'Gurpreet'),
(6, 'Delhi'),
(7, 'Spring'),
(8, 'Sky Diving'),
(9, 'Charisma'),
(10, '1'),
(11, 'Yes mostly'),
(12, 'null'),
(13, 'Vampire'),
(14, 'Horse'),
(15, 'Short');

-- --------------------------------------------------------

--
-- Table structure for table `tanmay_rank`
--

CREATE TABLE `tanmay_rank` (
  `Username` varchar(50) DEFAULT NULL,
  `score` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `tv_shows`
--

CREATE TABLE `tv_shows` (
  `SNo` int(50) NOT NULL,
  `Question` varchar(500) NOT NULL,
  `Answer` varchar(50) NOT NULL,
  `Option1` varchar(50) NOT NULL,
  `Option2` varchar(50) NOT NULL,
  `Option3` varchar(50) NOT NULL,
  `Option4` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

--
-- Dumping data for table `tv_shows`
--

INSERT INTO `tv_shows` (`SNo`, `Question`, `Answer`, `Option1`, `Option2`, `Option3`, `Option4`) VALUES
(1, 'Which actor from \'Friends\' later starred in a titular spin-off?', 'Matt LeBlanc', 'Courteney Cox', 'David Schwimmer', 'Matt LeBlanc', 'Jennifer Aniston'),
(2, 'Which of these is not a saying from Barney Stinson?(How I Met Your Mother)', 'Cool story, bro.', 'Suit up!', 'True story.', 'Legen—wait for it—dary.', 'Cool story, bro.'),
(3, 'What is the name given to the zombies by the characters?(The Walking Dead)', 'Walkers', 'Deadies', 'Killers', 'Risers', 'Walkers'),
(4, 'Which British actor plays the titular character?(Sherlock)', 'Benedict Cumberbatch', 'Tom Hiddleston', 'Hugh Laurie', 'Benedict Cumberbatch', 'Daniel Craig'),
(5, 'Who is Robb Stark\'s Wife?(Game of Thrones)', 'Talisa Stark', 'Talisa Stark', 'Sansa Stark', 'Catelyn Stark', 'Arya Stark'),
(6, 'Which of these sitcoms was set in Minneapolis?(Sitcom)', 'The Mary Tyler Moore Show', 'Frasier', 'The Mary Tyler Moore Show', 'Married...with Children', 'Cheers'),
(7, 'Which of the main characters pretended to be a marine biologist?(Seinfeld)', 'George', 'Kramer', 'Elaine', 'George', 'Jerry'),
(8, 'Which character does not work at the Krusty Krab?(SpongeBob)', 'Plankton', 'Squidward', 'Plankton', 'Mr. Krabs', 'SpongeBob'),
(9, 'The island the survivors landed on is located in which ocean?(Lost (ABC))', 'Pacific', 'Pacific', 'Atlantic', 'Arctic', 'Indian'),
(10, 'What is Arya\'s sword called?(Game of Thrones)\r\n', 'Needle', 'Deathhunt', 'Claw', 'Needle', 'Pin'),
(11, 'What is the name of the Original witch?(The Vampire Diaries)', 'Esther', 'Bonnie', 'Josephine', 'Dawn', 'Esther'),
(12, 'What is Elena\'s surname?(The vampire diaries)', 'Gilbert', 'Sullivan', 'Gilbert', 'Walters', 'Bennett'),
(13, 'Which of the group always brings an extra costume to a fancy dress party in case he strikes out with the hottest girl there?(HIMYM)', 'Barney', 'Ted', 'Carl', 'Marshall', 'Berney');

-- --------------------------------------------------------

--
-- Table structure for table `tv_shows_rank`
--

CREATE TABLE `tv_shows_rank` (
  `Username` varchar(50) NOT NULL,
  `score` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

--
-- Dumping data for table `tv_shows_rank`
--

INSERT INTO `tv_shows_rank` (`Username`, `score`) VALUES
('null', 3),
('ittirehan', 3);

-- --------------------------------------------------------

--
-- Table structure for table `user_info`
--

CREATE TABLE `user_info` (
  `Name` varchar(50) NOT NULL,
  `Dob` varchar(50) NOT NULL,
  `Gender` varchar(50) NOT NULL,
  `Email_id` varchar(50) NOT NULL,
  `Username` varchar(50) NOT NULL,
  `Password` varchar(50) DEFAULT NULL,
  `Phone_no` bigint(20) NOT NULL,
  `current_affairs` int(11) DEFAULT '0',
  `history` int(11) DEFAULT '0',
  `personal_quiz` int(11) DEFAULT '0',
  `sports` int(11) DEFAULT '0',
  `tv_shows` int(11) DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user_info`
--

INSERT INTO `user_info` (`Name`, `Dob`, `Gender`, `Email_id`, `Username`, `Password`, `Phone_no`, `current_affairs`, `history`, `personal_quiz`, `sports`, `tv_shows`) VALUES
('anirudh rehan', '27/10/2004', 'Male', 'anirudh@gmail.com', 'anirudh', 'appyani', 57690808708, 0, 0, 0, 0, 0),
('itti rehan', '01/04/1997', 'Female', 'ittirehan97@gmail.com', 'ittirehan', 'nishitbhai', 8725859555, 2, 2, 15, 3, 0),
('priya', '17/10/1999', 'Female', 'priya17@gmail.com', 'priya', 'priya', 57441, 0, 0, 0, 0, 0),
('Riya', '13/10/1997', 'Female', 'riyabansal1997@yahoo.in', 'Riya', 'riya', 57441, 0, 2, 15, 0, 0),
('tanmay', '28/11/1997', 'Male', 'tanmay@gmail.com', 'tanmay', 'tanmay', 37684274, 0, 7, 0, 0, 0),
('vishal dabas', '14/11/1996', 'Male', 'vishaldabas10@gmail.com', 'vishaldabas', 'abc', 8751231513, 5, 0, 15, 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `v`
--

CREATE TABLE `v` (
  `SNo` int(11) DEFAULT NULL,
  `Answer` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `v`
--

INSERT INTO `v` (`SNo`, `Answer`) VALUES
(1, 'Doctor'),
(2, 'A bed with big pillows'),
(3, '3'),
(4, '6ft'),
(5, 'Gurpreet'),
(6, 'Delhi'),
(7, 'Summer'),
(8, 'Paragliding'),
(9, 'Social Standing'),
(10, 'More than 2'),
(11, 'Yes seldom'),
(12, 'Buy a house'),
(13, 'Werewolf'),
(14, 'Cow');

-- --------------------------------------------------------

--
-- Table structure for table `v_rank`
--

CREATE TABLE `v_rank` (
  `Username` varchar(50) DEFAULT NULL,
  `score` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `v_rank`
--

INSERT INTO `v_rank` (`Username`, `score`) VALUES
('v', 0);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `user_info`
--
ALTER TABLE `user_info`
  ADD PRIMARY KEY (`Username`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
