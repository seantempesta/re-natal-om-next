 (ns ^:figwheel-no-load env.ios.main
  (:require [re-natal-om-next.ios.core :as core]
            [figwheel.client :as figwheel :include-macros true]))

 (enable-console-print!)

(figwheel/watch-and-reload
 :websocket-url "ws://localhost:3449/figwheel-ws"
 :heads-up-display true
 :jsload-callback core/init)

(core/init)
