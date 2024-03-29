-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le :  lun. 20 juin 2022 à 20:10
-- Version du serveur :  10.4.8-MariaDB
-- Version de PHP :  7.3.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `paradis`
--

-- --------------------------------------------------------

--
-- Structure de la table `analyse`
--

CREATE TABLE `analyse` (
  `id` int(11) NOT NULL,
  `detail` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `analyse`
--

INSERT INTO `analyse` (`id`, `detail`) VALUES
(1, ''),
(2, ''),
(3, ''),
(4, ''),
(5, ''),
(6, '');

-- --------------------------------------------------------

--
-- Structure de la table `bloc`
--

CREATE TABLE `bloc` (
  `id` int(11) NOT NULL,
  `nom` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `bloc`
--

INSERT INTO `bloc` (`id`, `nom`) VALUES
(1, 'block1'),
(2, 'block2');

-- --------------------------------------------------------

--
-- Structure de la table `chambre`
--

CREATE TABLE `chambre` (
  `id` int(11) NOT NULL,
  `numero` int(11) NOT NULL,
  `id_bloc` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `chambre`
--

INSERT INTO `chambre` (`id`, `numero`, `id_bloc`) VALUES
(1, 1, 1),
(2, 2, 1);

-- --------------------------------------------------------

--
-- Structure de la table `consultation`
--

CREATE TABLE `consultation` (
  `id` int(11) NOT NULL,
  `detail` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `consultation`
--

INSERT INTO `consultation` (`id`, `detail`) VALUES
(1, 'je sais pastest 000'),
(2, 'je sais pastest 000'),
(3, 'hj'),
(4, 'ef'),
(5, ''),
(6, ''),
(7, ''),
(8, ''),
(9, ''),
(10, ''),
(11, ''),
(12, '');

-- --------------------------------------------------------

--
-- Structure de la table `facture`
--

CREATE TABLE `facture` (
  `id` int(11) NOT NULL,
  `prix` int(11) NOT NULL,
  `id_prise_en_charge` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `facture`
--

INSERT INTO `facture` (`id`, `prix`, `id_prise_en_charge`) VALUES
(21, 0, 21),
(22, 0, 22);

-- --------------------------------------------------------

--
-- Structure de la table `hospitalisation`
--

CREATE TABLE `hospitalisation` (
  `id` int(11) NOT NULL,
  `detail` varchar(256) DEFAULT NULL,
  `id_materiel` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `hospitalisation`
--

INSERT INTO `hospitalisation` (`id`, `detail`, `id_materiel`) VALUES
(1, 'Un sejour de 26 jours', 2),
(2, 'Un sejour de 11 jours', 1);

-- --------------------------------------------------------

--
-- Structure de la table `materiel`
--

CREATE TABLE `materiel` (
  `id` int(11) NOT NULL,
  `nom` varchar(30) NOT NULL,
  `numero` int(11) NOT NULL,
  `etat` tinyint(1) NOT NULL,
  `id_chambre` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `materiel`
--

INSERT INTO `materiel` (`id`, `nom`, `numero`, `etat`, `id_chambre`) VALUES
(1, 'lit', 1, 1, 1),
(2, 'lit', 2, 1, 2);

-- --------------------------------------------------------

--
-- Structure de la table `ordonnance`
--

CREATE TABLE `ordonnance` (
  `id` int(11) NOT NULL,
  `detail` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Structure de la table `patient`
--

CREATE TABLE `patient` (
  `id` int(11) NOT NULL,
  `nom` varchar(30) NOT NULL,
  `prenom` varchar(30) NOT NULL,
  `genre` varchar(20) NOT NULL COMMENT 'homme/femme',
  `date_naissance` date NOT NULL,
  `tel` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `patient`
--

INSERT INTO `patient` (`id`, `nom`, `prenom`, `genre`, `date_naissance`, `tel`) VALUES
(1, 'bore', 'younouss', 'male', '2012-12-12', '666'),
(2, 'd2', 'd2', 'd2', '2022-06-03', 's2'),
(3, '1', '2', '2', '2022-06-10', '1'),
(4, 'testets', 'testets', 'testets', '2022-06-05', '54654'),
(5, 'opop', 'opop', 'opop', '2022-06-04', '7+845'),
(6, 'opop', 'opop', 'opop', '2022-06-04', '7+845'),
(7, '654', '654', '654', '2022-06-04', '654'),
(8, '45', '45', '45', '2022-06-04', '45'),
(9, '13', '13', '13', '2022-06-04', '13'),
(10, '35', '35', '35', '2022-06-04', '35'),
(11, 'bore', 'younouss', '54', '2022-06-05', '15'),
(12, '54', '65', 'homme', '2022-06-04', '65'),
(13, '54', '65', 'homme', '2022-06-04', '65'),
(14, 'rthrdtrthrthh', 'dfgnntjtj', 'homme', '2022-06-05', 'rrdtjhrj');

-- --------------------------------------------------------

--
-- Structure de la table `prise_en_charge`
--

CREATE TABLE `prise_en_charge` (
  `id` int(11) NOT NULL,
  `date` datetime NOT NULL DEFAULT current_timestamp(),
  `id_patient` int(11) NOT NULL,
  `id_consultation` int(11) DEFAULT NULL,
  `id_ordonnance` int(11) DEFAULT NULL,
  `id_analyse` int(11) DEFAULT NULL,
  `id_traitement` int(11) DEFAULT NULL,
  `id_hospitalisation` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `prise_en_charge`
--

INSERT INTO `prise_en_charge` (`id`, `date`, `id_patient`, `id_consultation`, `id_ordonnance`, `id_analyse`, `id_traitement`, `id_hospitalisation`) VALUES
(1, '2022-06-18 23:26:45', 8, 1, NULL, NULL, NULL, NULL),
(2, '2022-06-18 23:27:01', 8, 2, NULL, NULL, NULL, NULL),
(3, '2022-06-18 23:29:11', 6, 3, NULL, NULL, NULL, NULL),
(4, '2022-06-18 23:32:08', 6, 4, NULL, NULL, NULL, NULL),
(5, '2022-06-18 23:33:23', 6, NULL, NULL, NULL, 1, NULL),
(6, '2022-06-18 23:35:34', 6, NULL, NULL, NULL, 2, NULL),
(7, '2022-06-19 00:00:26', 9, 5, NULL, NULL, NULL, NULL),
(8, '2022-06-19 00:01:57', 7, 6, NULL, NULL, NULL, NULL),
(9, '2022-06-19 00:16:49', 9, 7, NULL, NULL, NULL, NULL),
(10, '2022-06-19 00:17:30', 7, 8, NULL, NULL, NULL, NULL),
(11, '2022-06-19 00:17:40', 7, 9, NULL, NULL, NULL, NULL),
(12, '2022-06-19 00:17:43', 7, 10, NULL, NULL, NULL, NULL),
(13, '2022-06-19 00:17:51', 14, NULL, NULL, 1, NULL, NULL),
(14, '2022-06-19 00:17:54', 14, NULL, NULL, 2, NULL, NULL),
(15, '2022-06-19 00:17:56', 14, 11, NULL, NULL, NULL, NULL),
(16, '2022-06-19 00:17:59', 14, 12, NULL, NULL, NULL, NULL),
(17, '2022-06-19 00:18:02', 14, NULL, NULL, 3, NULL, NULL),
(18, '2022-06-19 00:19:25', 7, NULL, NULL, 4, NULL, NULL),
(19, '2022-06-19 00:19:30', 14, NULL, NULL, 5, NULL, NULL),
(20, '2022-06-19 00:21:00', 9, NULL, NULL, 6, NULL, NULL),
(21, '2022-06-19 02:09:15', 7, NULL, NULL, NULL, NULL, 1),
(22, '2022-06-20 13:55:08', 14, NULL, NULL, NULL, NULL, 2);

-- --------------------------------------------------------

--
-- Structure de la table `relation_prise_en_charge`
--

CREATE TABLE `relation_prise_en_charge` (
  `id` int(11) NOT NULL,
  `id_user` int(11) NOT NULL,
  `id_prise_en_charge` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `relation_prise_en_charge`
--

INSERT INTO `relation_prise_en_charge` (`id`, `id_user`, `id_prise_en_charge`) VALUES
(1, 6, 3),
(2, 6, 4),
(3, 6, 5),
(4, 6, 6),
(5, 6, 7),
(6, 6, 8),
(7, 6, 9),
(8, 6, 10),
(9, 6, 11),
(10, 6, 12),
(11, 6, 13),
(12, 6, 14),
(13, 6, 15),
(14, 6, 16),
(15, 6, 17),
(16, 6, 18),
(17, 6, 19),
(18, 6, 20),
(19, 6, 21),
(20, 6, 22);

-- --------------------------------------------------------

--
-- Structure de la table `ticket`
--

CREATE TABLE `ticket` (
  `id` int(11) NOT NULL,
  `numero` varchar(10) NOT NULL,
  `date` datetime NOT NULL DEFAULT current_timestamp(),
  `motif` text NOT NULL,
  `statut` tinyint(1) NOT NULL DEFAULT 1,
  `id_bloc` int(11) NOT NULL,
  `id_patient` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `ticket`
--

INSERT INTO `ticket` (`id`, `numero`, `date`, `motif`, `statut`, `id_bloc`, `id_patient`) VALUES
(6, 'yukg', '2022-06-17 20:13:40', 'tyj', 1, 1, 9),
(7, 'tf', '2022-06-17 20:13:40', 'tj', 1, 1, 7),
(8, 'A1', '2022-06-17 20:14:47', 'drhrdjryj', 1, 1, 14);

-- --------------------------------------------------------

--
-- Structure de la table `traitement`
--

CREATE TABLE `traitement` (
  `id` int(11) NOT NULL,
  `detail` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `traitement`
--

INSERT INTO `traitement` (`id`, `detail`) VALUES
(1, 'db'),
(2, '');

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `nom` varchar(30) NOT NULL,
  `prenom` varchar(30) NOT NULL,
  `email` varchar(60) NOT NULL,
  `mot_de_passe` varchar(30) NOT NULL,
  `role` varchar(20) NOT NULL,
  `id_bloc` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `user`
--

INSERT INTO `user` (`id`, `nom`, `prenom`, `email`, `mot_de_passe`, `role`, `id_bloc`) VALUES
(5, '46', '45', '', '47', '48', NULL),
(6, '46', '45', '', '47', '48', NULL),
(7, '46', '47', '48', '45', '', NULL),
(8, 'tgl1', 'tgl2', 'tgl3', 'tgl4', 'tgl5', NULL),
(9, '48', '47', '46', '', '45', NULL),
(10, 'B48', 'B3', 'Bonjours2', 'email', 'Bonjour', NULL),
(11, 'B48', 'B3', 'Bonjours2', 'emailtest', 'Bonjour', NULL),
(12, 'nom', 'prenom', 'email', 'mot_de_passe', 'role', 1);

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `analyse`
--
ALTER TABLE `analyse`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `bloc`
--
ALTER TABLE `bloc`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `chambre`
--
ALTER TABLE `chambre`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_bloc` (`id_bloc`);

--
-- Index pour la table `consultation`
--
ALTER TABLE `consultation`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `facture`
--
ALTER TABLE `facture`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_prise_en_charge` (`id_prise_en_charge`);

--
-- Index pour la table `hospitalisation`
--
ALTER TABLE `hospitalisation`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_materiel` (`id_materiel`);

--
-- Index pour la table `materiel`
--
ALTER TABLE `materiel`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_chambre` (`id_chambre`);

--
-- Index pour la table `ordonnance`
--
ALTER TABLE `ordonnance`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `patient`
--
ALTER TABLE `patient`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `prise_en_charge`
--
ALTER TABLE `prise_en_charge`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_analyse` (`id_analyse`),
  ADD KEY `id_consultation` (`id_consultation`),
  ADD KEY `id_hospitalisation` (`id_hospitalisation`),
  ADD KEY `id_ordonnance` (`id_ordonnance`),
  ADD KEY `id_patient` (`id_patient`),
  ADD KEY `id_traitement` (`id_traitement`);

--
-- Index pour la table `relation_prise_en_charge`
--
ALTER TABLE `relation_prise_en_charge`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_user` (`id_user`),
  ADD KEY `id_prise_en_charge` (`id_prise_en_charge`);

--
-- Index pour la table `ticket`
--
ALTER TABLE `ticket`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_patient` (`id_patient`),
  ADD KEY `id_bloc` (`id_bloc`);

--
-- Index pour la table `traitement`
--
ALTER TABLE `traitement`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_bloc` (`id_bloc`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `analyse`
--
ALTER TABLE `analyse`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT pour la table `bloc`
--
ALTER TABLE `bloc`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT pour la table `chambre`
--
ALTER TABLE `chambre`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT pour la table `consultation`
--
ALTER TABLE `consultation`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT pour la table `facture`
--
ALTER TABLE `facture`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT pour la table `hospitalisation`
--
ALTER TABLE `hospitalisation`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT pour la table `materiel`
--
ALTER TABLE `materiel`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT pour la table `ordonnance`
--
ALTER TABLE `ordonnance`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `patient`
--
ALTER TABLE `patient`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT pour la table `prise_en_charge`
--
ALTER TABLE `prise_en_charge`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT pour la table `relation_prise_en_charge`
--
ALTER TABLE `relation_prise_en_charge`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT pour la table `ticket`
--
ALTER TABLE `ticket`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT pour la table `traitement`
--
ALTER TABLE `traitement`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT pour la table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `chambre`
--
ALTER TABLE `chambre`
  ADD CONSTRAINT `chambre_ibfk_1` FOREIGN KEY (`id_bloc`) REFERENCES `bloc` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `facture`
--
ALTER TABLE `facture`
  ADD CONSTRAINT `facture_ibfk_1` FOREIGN KEY (`id_prise_en_charge`) REFERENCES `prise_en_charge` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `hospitalisation`
--
ALTER TABLE `hospitalisation`
  ADD CONSTRAINT `hospitalisation_ibfk_1` FOREIGN KEY (`id_materiel`) REFERENCES `materiel` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `materiel`
--
ALTER TABLE `materiel`
  ADD CONSTRAINT `materiel_ibfk_1` FOREIGN KEY (`id_chambre`) REFERENCES `chambre` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `prise_en_charge`
--
ALTER TABLE `prise_en_charge`
  ADD CONSTRAINT `prise_en_charge_ibfk_1` FOREIGN KEY (`id_analyse`) REFERENCES `analyse` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `prise_en_charge_ibfk_2` FOREIGN KEY (`id_consultation`) REFERENCES `consultation` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `prise_en_charge_ibfk_3` FOREIGN KEY (`id_hospitalisation`) REFERENCES `hospitalisation` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `prise_en_charge_ibfk_4` FOREIGN KEY (`id_ordonnance`) REFERENCES `ordonnance` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `prise_en_charge_ibfk_5` FOREIGN KEY (`id_patient`) REFERENCES `patient` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `prise_en_charge_ibfk_6` FOREIGN KEY (`id_traitement`) REFERENCES `traitement` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `relation_prise_en_charge`
--
ALTER TABLE `relation_prise_en_charge`
  ADD CONSTRAINT `relation_prise_en_charge_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `relation_prise_en_charge_ibfk_2` FOREIGN KEY (`id_prise_en_charge`) REFERENCES `prise_en_charge` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `ticket`
--
ALTER TABLE `ticket`
  ADD CONSTRAINT `ticket_ibfk_1` FOREIGN KEY (`id_patient`) REFERENCES `patient` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `ticket_ibfk_2` FOREIGN KEY (`id_bloc`) REFERENCES `bloc` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `user`
--
ALTER TABLE `user`
  ADD CONSTRAINT `user_ibfk_1` FOREIGN KEY (`id_bloc`) REFERENCES `bloc` (`id`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
