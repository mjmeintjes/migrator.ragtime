(defproject duct/migrator.ragtime "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [integrant "0.3.1"]
                 [pandect "0.6.1"]
                 [ragtime "0.7.0"]]
  :profiles
  {:dev {:source-paths ["dev"]
         :dependencies [[duct/database.sql "0.1.0-SNAPSHOT"]
                        [integrant/repl "0.1.1"]
                        [org.xerial/sqlite-jdbc "3.16.1"]]}})