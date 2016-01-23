 (ns ^:figwheel-no-load env.android.main
  (:require [re-natal-om-next.android.core :as core]
            [figwheel.client :as figwheel :include-macros true]))

 (enable-console-print!)

(figwheel/watch-and-reload
 :websocket-url "ws://localhost:3449/figwheel-ws"
 :heads-up-display true)

(core/init)